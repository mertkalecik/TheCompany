package model.packaging.strategy;

import interfaces.IPackagingStrategy;

public class BookPackStrategy implements IPackagingStrategy {

    @Override
    public void packItem(String type) {
        System.out.println("-------------------------------------------------");
        System.out.println(type +" packaged with envelope and stamp");
    }
}
