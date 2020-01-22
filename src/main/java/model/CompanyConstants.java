package model;

import model.book.AdventureBook;
import model.book.BookFactory;
import model.book.DramaBook;
import model.book.SciencefictionBook;
import model.food.FoodFactory;
import model.food.FreshFood;
import model.food.FrozenFood;
import model.instrument.InstrumentFactory;
import model.instrument.StringInstrument;
import model.instrument.VocalInstrument;

public class CompanyConstants {

    /*
        Book Store
     */
    public static final String CLASS_NAME_BOOK_FACTORY = BookFactory.class.getName();
    public static final String CLASS_NAME_BOOK_DRAMA = DramaBook.class.getName();
    public static final String CLASS_NAME_BOOK_ADVENTURE = AdventureBook.class.getName();
    public static final String CLASS_NAME_BOOK_SCIENCE = SciencefictionBook.class.getName();


    /*
        Food Store
     */
    public static final String CLASS_NAME_FOOD_FACTORY = FoodFactory.class.getName();
    public static final String CLASS_NAME_FOOD_FRESH = FreshFood.class.getName();
    public static final String CLASS_NAME_FOOD_FROZEN = FrozenFood.class.getName();



    /*
        Music Instrument Store
     */
    public static final String CLASS_NAME_INSTRUMENT_FACTORY = InstrumentFactory.class.getName();
    public static final String CLASS_NAME_INSTRUMENT_STRING = StringInstrument.class.getName();
    public static final String CLASS_NAME_INSTRUMENT_VOCAL = VocalInstrument.class.getName();

}
