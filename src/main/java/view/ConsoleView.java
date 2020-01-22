package view;

import model.CompanyModel;

public class ConsoleView extends BaseConsoleView {
    private CompanyModel model;

    public ConsoleView(CompanyModel model) {
        this.model = model;
        start();
    }

    private int menu() {
        System.out.println("-----------The Company Management Screen----------");
        System.out.println("1.Show All Products");
        System.out.println("2.Add Product By Id");
        System.out.println("3.Show Order Line Items");
        System.out.println("4.Finish Order and Pack");
        System.out.println("-1.Terminate");

        return readInt(1,4);
    }

    private void start() {
        while (true) {
            int choice = menu();

            switch (choice) {
                case -1:
                    System.exit(0);
                    break;
                case 1:
                    model.printAllProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    model.printOrderLineItems();
                    break;
                case 4:
                    model.finishOrder();
                    break;
                default:
                    break;
            }
        }
    }


    private void addProduct() {
        System.out.println("-------------------------------------------------");
        System.out.println("Enter Product Id From Catalog: ");
        Integer productId = readInt(0, 8);
        model.addProduct(model.getProduct(productId));
    }
}
