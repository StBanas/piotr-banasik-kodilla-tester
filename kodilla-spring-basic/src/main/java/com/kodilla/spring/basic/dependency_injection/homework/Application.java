package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DeliveryService deliveryService = new DHLShippingCenter();
        NotificationService notificationService = new DHLNotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);

        shippingCenter.processDelivery("Hill Street 11, New York", 18.2);
    }
}