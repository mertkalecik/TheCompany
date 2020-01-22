package model;

import interfaces.AbstractFactory;
import interfaces.IProduct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductCatalog {
    private AbstractFactory factory;
    private Map<Integer, IProduct> descriptions;

    public ProductCatalog() {
        descriptions = new HashMap<>();

        factory = FactoryProvider.getFactory(CompanyConstants.CLASS_NAME_BOOK_FACTORY);
        descriptions.put(1, (IProduct)factory.create(CompanyConstants.CLASS_NAME_BOOK_DRAMA));
        descriptions.put(2, (IProduct)factory.create(CompanyConstants.CLASS_NAME_BOOK_ADVENTURE));
        descriptions.put(3, (IProduct)factory.create(CompanyConstants.CLASS_NAME_BOOK_SCIENCE));

        factory = FactoryProvider.getFactory(CompanyConstants.CLASS_NAME_FOOD_FACTORY);
        descriptions.put(4, (IProduct)factory.create(CompanyConstants.CLASS_NAME_FOOD_FRESH));
        descriptions.put(5, (IProduct)factory.create(CompanyConstants.CLASS_NAME_FOOD_FROZEN));

        factory = FactoryProvider.getFactory(CompanyConstants.CLASS_NAME_INSTRUMENT_FACTORY);
        descriptions.put(6, (IProduct)factory.create(CompanyConstants.CLASS_NAME_INSTRUMENT_STRING));
        descriptions.put(7, (IProduct)factory.create(CompanyConstants.CLASS_NAME_INSTRUMENT_VOCAL));
    }

    public IProduct getProduct(Integer id) {
        IProduct product = descriptions.get(id);
        return product;
    }

    public List<IProduct> getAllProducts() {
        List<IProduct> myProducts = new ArrayList<>();

        for (Map.Entry<Integer, IProduct> entry: descriptions.entrySet()) {
                myProducts.add(descriptions.get(entry.getKey()));
        }

        return myProducts;
    }

}
