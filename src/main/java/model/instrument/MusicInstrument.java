package model.instrument;

import interfaces.IPackagingStrategy;
import interfaces.IProduct;

public abstract class MusicInstrument implements IProduct {
    protected IPackagingStrategy strategy;
}
