package com.kodilla.mockito.homework;

public interface Client {

    void receive(WeatherReportAlert wra);

    void receiveRegulationChanges(WeatherReportAlert regulationChanges);

    void addToMap(String localization);

}
