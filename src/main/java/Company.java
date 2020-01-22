import model.CompanyModel;
import model.ProductCatalog;
import view.ConsoleView;

public class Company {

    public static void main(String[] args) {
        System.out.println("Hello CompanyModel XYZ");

        ProductCatalog catalog = new ProductCatalog();
        CompanyModel model = new CompanyModel(catalog);
        ConsoleView view = new ConsoleView(model);
    }
}
