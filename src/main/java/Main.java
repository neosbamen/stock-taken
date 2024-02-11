import model.EnumProductType;
import model.Product;
import service.IInventoryGestor;
import service.InventoryGestorImpl;

public class Main {
    public static void main(String[] args) {

        Product pillow1= new Product("Almohad a",1234,3, EnumProductType.Pillow);
        Product pillowCase=new Product("Funda",9876,5,EnumProductType.Cases);
        Product blanket=new Product("Sabana",545,8,EnumProductType.Blanket);

        IInventoryGestor inventoryGestor = new InventoryGestorImpl();

        System.out.println(inventoryGestor.createProduct(pillow1));
        System.out.println(inventoryGestor.createProduct(pillowCase));
        System.out.println();
        System.out.println(inventoryGestor.readProduct(9876));
        System.out.println(inventoryGestor.readProduct(545));
        System.out.println();
        System.out.println(inventoryGestor.updatingProduct(1234,blanket));
        System.out.println();
        System.out.println(inventoryGestor.deleteProduct(9876));
        System.out.println();
        System.out.println(inventoryGestor.readProduct(9876));



    }
}