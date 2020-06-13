package com.design.factoryPattern;

public class CourierService implements NotificationService {
    @Override
    public void notifyUser() {
        System.out.println("Courier has been sent to user successfully");
    }
}
