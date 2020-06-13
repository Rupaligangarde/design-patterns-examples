package com.design;

import com.design.factoryPattern.NotificationFactory;
import com.design.factoryPattern.NotificationService;

public class DesignPatternApplication {

    public static void main(String[] args) {

        NotificationFactory factory = new NotificationFactory();
        NotificationService smsService = factory.createNotificationService("SMS");
        smsService.notifyUser();

        NotificationService emailService = factory.createNotificationService("EMAIL");
        emailService.notifyUser();

        NotificationService courierService = factory.createNotificationService("COURIER");
        courierService.notifyUser();
    }
}
