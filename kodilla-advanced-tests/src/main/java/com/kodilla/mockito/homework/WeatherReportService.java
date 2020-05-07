package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WeatherReportService {

    public Map<Client, String> getClients() { return clients; }

    private Map<Client, String> clients = new HashMap<>();

    public void addClientToSelectedLocalization(Client client, String localization) {
        this.clients.put(client, localization);
    }

    public void sendWeatherAlert(WeatherReportAlert wra){
        this.clients.forEach((client, localization) -> client.receive(wra));
    }
    public void sendWeatherAlertRegulationChangesToAll(WeatherReportAlert regulationChanges){
        this.clients.forEach((client, localization) -> client.receive(regulationChanges));
    }

    public void removeClientFromSelectedLocalization(Client client, String localization) {
             this.clients.remove(client, localization);
        }

    public void removeLocalization( Client client, String localization) {
        this.clients.remove(client, localization);
    }

    public void sendReportToAllForSelectedLocalization(WeatherReportAlert wra, String localization) {

        Map<Client, String> someClients = clients.entrySet()
        .stream()
        .filter(c -> localization.equals(c.getValue()))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        someClients.forEach((client, location) -> client.receive(wra));

        }
    }
