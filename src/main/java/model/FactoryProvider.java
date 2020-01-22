package model;

import interfaces.AbstractFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String factoryName) {

        try {
            Class<?> clazz = Class.forName(factoryName);
            return  (AbstractFactory) clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
