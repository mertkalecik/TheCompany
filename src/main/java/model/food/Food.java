package model.food;

import interfaces.IPackagingStrategy;
import interfaces.IProduct;

public abstract class Food implements IProduct {
    protected IPackagingStrategy strategy;
}
