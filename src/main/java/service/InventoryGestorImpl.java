package service;
import model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class InventoryGestorImpl implements IInventoryGestor{

    private final List<Product> productList;


    public InventoryGestorImpl(){

        productList=new ArrayList<>();
    }

    @Override
    public Boolean createProduct(Product product) {

        boolean anyMatch = this.productList.stream().anyMatch(e->e.getId().equals(product.getId()));

        if (!anyMatch){
            this.productList.add(product);
            return true;
        }
        return false;
    }

    @Override
    public Optional<Product> readProduct(int id) {

        return this.productList.stream().filter(e->e.getId().equals(id)).findFirst();
    }

    @Override
    public Optional<Product> updatingProduct(int id, Product product) {

        Optional<Product> productFoundOpt=readProduct(id);

        if (productFoundOpt.isPresent()){

            Product productFound= productFoundOpt.get();

            productFound.setId(product.getId());
            productFound.setName(product.getName());
            productFound.setProductType(product.getProductType());
            productFound.setQuantity(product.getQuantity());

            return Optional.of(productFound);
        }
        return Optional.empty();
    }

    @Override
    public Boolean deleteProduct(int id) {

        return this.productList.removeIf(e->e.getId().equals(id));
    }
}
