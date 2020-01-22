package model.packaging.strategy;

import interfaces.IPackagingStrategy;

public class FrozenFoodPackStrategy implements IPackagingStrategy {

    @Override
    public void packItem(String type) {
        System.out.println("-------------------------------------------------");
        System.out.println(type + " packaged with box and dry ice.");
    }
}
