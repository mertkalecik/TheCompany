package model.book;

import interfaces.IPackagingStrategy;
import model.packaging.strategy.BookPackStrategy;

public class DramaBook extends Book {

    public DramaBook() {
        strategy = new BookPackStrategy();
    }

    @Override
    public String getType() {
        return "DramaBook";
    }

    @Override
    public void pack() {
        strategy.packItem(getClass().getSimpleName());
    }
}
