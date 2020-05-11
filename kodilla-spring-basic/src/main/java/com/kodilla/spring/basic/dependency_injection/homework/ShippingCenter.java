package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    private DeliveryService deliveryService;
    private final NotificationService notificationService;

    public ShippingCenter(DeliveryService deliveryService, NotificationService notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public void processDelivery(String address, double weight) {
        if (sendPackage(address, weight)) {
            this.notificationService.success(address);
        }
         else this.notificationService.fail(address);
        }

    public boolean sendPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package too heavy");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
    }
}