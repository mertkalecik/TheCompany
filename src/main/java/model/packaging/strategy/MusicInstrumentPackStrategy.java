package model.packaging.strategy;

import interfaces.IPackagingStrategy;

public class MusicInstrumentPackStrategy implements IPackagingStrategy {

    @Override
    public void packItem(String type) {
        System.out.println("-------------------------------------------------");
        System.out.println(type + " packaged with large box and foam.");
    }
}
