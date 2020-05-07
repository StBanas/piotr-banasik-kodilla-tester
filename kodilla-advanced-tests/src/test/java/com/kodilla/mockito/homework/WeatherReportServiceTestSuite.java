package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherReportServiceTestSuite {


    WeatherReportService weatherReportService = new WeatherReportService();
    Client client = Mockito.mock(Client.class);
    Client client2 = Mockito.mock(Client.class);
    Client client3 = Mockito.mock(Client.class);
    WeatherReportAlert wra = Mockito.mock(WeatherReportAlert.class);
    WeatherReportAlert regulationChanges = Mockito.mock(WeatherReportAlert.class);


    @Test
    public void shouldAddClientToSelectedLocalization() {
        weatherReportService.addClientToSelectedLocalization(client, "Gdańsk");
        client.addToMap("Gdańsk");
        Mockito.verify(client, Mockito.times(1)).addToMap("Gdańsk"); //TODO - to correct this condition
    }

    @Test
    public void NotSignedInClientShouldNotRecieveAlert() {
        Mockito.verify(client, Mockito.never()).receive(wra);

    }

    @Test
    public void signedInClientShouldReceiveNotification() {
        weatherReportService.addClientToSelectedLocalization(client, "Warszawa");
        weatherReportService.addClientToSelectedLocalization(client, "Gdańsk");
        weatherReportService.addClientToSelectedLocalization(client2, "Wrocław");

        weatherReportService.sendWeatherAlert(wra);
        Mockito.verify(client, Mockito.times(1)).receive(wra);
        Mockito.verify(client2, Mockito.times(1)).receive(wra);
        Mockito.verify(client3, Mockito.times(0)).receive(wra);
    }

    @Test
    public void allClientsShouldReceiveRegulationChanges() {
        weatherReportService.addClientToSelectedLocalization(client, "Warszawa");
        weatherReportService.addClientToSelectedLocalization(client, "Gdańsk");
        weatherReportService.addClientToSelectedLocalization(client2, "Warszawa");

        weatherReportService.sendWeatherAlertRegulationChangesToAll(regulationChanges);
        Mockito.verify(client, Mockito.atLeast(1)).receive(regulationChanges);
        Mockito.verify(client2, Mockito.atLeast(1)).receive(regulationChanges);
    }

    @Test
    public void shoulRemoveClientFromAllLocalizatons() {
        // given
        weatherReportService.addClientToSelectedLocalization(client, "Wrocław");
        weatherReportService.addClientToSelectedLocalization(client, "Warszawa");

        //when1
        weatherReportService.sendWeatherAlert(wra);
        weatherReportService.removeClientFromSelectedLocalization(client, "Wrocław");

        //then1
        Mockito.verify(client, Mockito.times(1)).receive(wra);

        //when2
        weatherReportService.removeClientFromSelectedLocalization(client, "Warszawa");
        weatherReportService.sendWeatherAlert(wra);
        //then2
        Mockito.verify(client, Mockito.times(1)).receive(wra);
    }

    @Test
    public void shouldAlertBeSentToAllClientsInSelectedLocalization() {
        //given
//        client.addToMap("Warszawa");
        weatherReportService.addClientToSelectedLocalization(client, "Warszawa");
        weatherReportService.addClientToSelectedLocalization(client2, "Warszawa");
        weatherReportService.addClientToSelectedLocalization(client3, "Londyn");
        //when
        weatherReportService.sendReportToAllForSelectedLocalization(wra, "Warszawa");
        //then
        Mockito.verify(client, Mockito.times(1)).receive(wra);
        Mockito.verify(client2, Mockito.times(1)).receive(wra);
        Mockito.verify(client3, Mockito.times(0)).receive(wra);
    }

    @Test
    public void shouldRemoveLocalization() {
        //given
        weatherReportService.addClientToSelectedLocalization(client3, "Wrocław");
        //when
        weatherReportService.sendWeatherAlert(wra);
        Mockito.verify(client3, Mockito.times(1)).receive(wra);
        weatherReportService.removeLocalization(client3, "Wrocław");
        weatherReportService.sendWeatherAlert(wra);

        //then
        Mockito.verify(client3, Mockito.times(1)).receive(wra);

    }
}
