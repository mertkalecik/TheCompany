package model.packaging.strategy;

import interfaces.IPackagingStrategy;

public class FreshFoodPackStrategy implements IPackagingStrategy {

    @Override
    public void packItem(String type) {
        System.out.println("-------------------------------------------------");
        System.out.println(type +" packaged with box and foam.");
    }
}
