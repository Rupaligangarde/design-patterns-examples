package com.design.factoryPattern;

public class NotificationFactory{
    public NotificationService createNotificationService(String notifyChannel){
        switch (notifyChannel){
            case "SMS":
                return new SMSService();
            case "EMAIL":
                return new EmailService();
            case "COURIER":
                return new CourierService();
            default:
                throw new IllegalArgumentException("Invalid notify channel, please verify");
        }
    }
}