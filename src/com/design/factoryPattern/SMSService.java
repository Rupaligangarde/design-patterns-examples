package com.design.factoryPattern;

public class SMSService implements NotificationService {

    @Override
    public void notifyUser() {
        System.out.println("SMS has been sent to user successfully");
    }
}
