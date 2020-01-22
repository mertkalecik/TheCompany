package model.book;

import interfaces.IPackagingStrategy;
import interfaces.IProduct;

public abstract class Book implements IProduct {
    protected IPackagingStrategy strategy;
}
