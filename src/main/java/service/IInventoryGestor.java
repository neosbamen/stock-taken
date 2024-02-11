package service;

import model.Product;

import java.util.Optional;

public interface IInventoryGestor {

    Boolean createProduct(Product product);
    Optional<Product> readProduct(int id);
    Optional<Product> updatingProduct(int id,Product product);
    Boolean deleteProduct(int id);
}
