package model.book;


import interfaces.IPackagingStrategy;
import interfaces.IProduct;
import model.packaging.strategy.BookPackStrategy;

public class AdventureBook extends Book {

    public AdventureBook() {
        strategy = new BookPackStrategy();
    }

    @Override
    public String getType() {
        return "AdventureBook";
    }

    @Override
    public void pack() {
        strategy.packItem(getClass().getSimpleName());
    }
}
