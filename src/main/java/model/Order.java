package model;

import interfaces.IProduct;

import java.util.*;

public class Order {
    private Integer orderId;
    private List<IProduct> lineItems;

    public Order(Integer orderId, List<IProduct> lineItems) {
        this.orderId = orderId;
        this.lineItems = lineItems;
    }

    Random rand = new Random();

    public Order() {
        this.lineItems = new ArrayList<>();
        this.orderId = rand.nextInt(50000);//Random orderId
    }

    public void makeNewOrder() {
        this.orderId = rand.nextInt();
        this.lineItems.clear();
    }

    public void makeLineItem(IProduct p) {
        lineItems.add(p);
    }

    public void clearLineItems() {
        lineItems.clear();
    }

    @Override
    public String toString() {
        return "Order Id: " +this.getOrderId();
    }

    public List<IProduct> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<IProduct> lineItems) {
        this.lineItems = lineItems;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

}
