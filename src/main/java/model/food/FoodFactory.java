package model.food;

import interfaces.AbstractFactory;

public class FoodFactory implements AbstractFactory<Food> {

    @Override
    public Food create(String type) {

        try {
            Class<?> clazz = Class.forName(type);
            return  (Food) clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }
}
