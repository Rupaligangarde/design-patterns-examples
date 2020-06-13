package com.design.factoryPattern;

public class EmailService implements NotificationService {
    @Override
    public void notifyUser() {
        System.out.println("Email has been sent to user successfully");
    }
}
