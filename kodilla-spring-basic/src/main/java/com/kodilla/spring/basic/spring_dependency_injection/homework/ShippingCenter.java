package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class ShippingCenter {
    private DHLDeliveryService deliveryService;
    private DHLNotificationService notificationService;

    public ShippingCenter(DHLDeliveryService deliveryService, DHLNotificationService notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public String sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            return this.notificationService.success(address);
        }
        return notificationService.fail(address);
    }
}
