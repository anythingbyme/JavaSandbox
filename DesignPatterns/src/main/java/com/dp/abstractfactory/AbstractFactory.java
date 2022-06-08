package com.dp.abstractfactory;

public class AbstractFactory {
    /**
     * Factory itself is abstract: meaning AbstractFactory.get("type") could return ex NYPizzaFactory
     * or CAPizzaFactory or CheesePizzaFactory etc
     *
     * Another example from Wikipedia:
     * DcoumentCreator creates Letter or Resume based on type
     */

    public void createDevice(String deviceType) {}
}
