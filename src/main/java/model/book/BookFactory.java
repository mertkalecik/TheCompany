package model.book;

import interfaces.AbstractFactory;

public class BookFactory implements AbstractFactory<Book> {

    @Override
    public Book create(String type) {

        try {
            Class<?> clazz = Class.forName(type);
            return  (Book)clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            System.out.println("An error occured while trying to initialize book class.");
            e.printStackTrace();
        }

        return null;
    }
}
