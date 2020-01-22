package model.book;

import interfaces.IPackagingStrategy;
import model.packaging.strategy.BookPackStrategy;

public class SciencefictionBook extends Book {

    public SciencefictionBook() {
        this.strategy = new BookPackStrategy();
    }

    @Override
    public String getType() {
        return "ScienceFictionBook";
    }

    @Override
    public void pack() {
        strategy.packItem(getClass().getSimpleName());
    }
}
