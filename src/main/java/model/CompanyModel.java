package model;


import interfaces.IProduct;

import java.util.List;

/*
    CompanyModel Model
 */
public class CompanyModel {
    private Order order;
    private ProductCatalog catalog;

    public CompanyModel(ProductCatalog catalog) {
        this.catalog = catalog;
        this.order = new Order();
    }

    public void addProduct(IProduct p) {
        order.makeLineItem(p);
    }

    public void finishOrder() {
        System.out.println("----------------Order Finished-------------------");

        List<IProduct> products = order.getLineItems();
        order = new Order();

        for (IProduct p: products) {
            packProduct(p);
        }

        order.makeNewOrder();
        System.out.println("-------------------------------------------------");
    }

    private void packProduct(IProduct p) {
        p.pack();
    }

    public void printOrderLineItems() {
        List<IProduct> products = order.getLineItems();

        System.out.println("-------------------------------------------------");
        if (products.size() > 0) {
            for (int i = 0; i < products.size(); i++) {
                System.out.println(i+1 +". " + products.get(i).getType());
            }
        } else
            System.out.println("Order is empty right now");

        System.out.println("-------------------------------------------------");
    }

    public IProduct getProduct(Integer id) {
        return catalog.getProduct(id);
    }

    public void printAllProducts() {
        List<IProduct> products = catalog.getAllProducts();

        System.out.println("-------------------------------------------------");

        for (int i = 0; i < products.size(); i++) {
            System.out.println(i+1 + ". " + products.get(i).getType());
        }

        System.out.println("-------------------------------------------------");
    }
}
