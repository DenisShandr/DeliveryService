package service;

import domain.Product;
import dto.ProductDTO;

public interface ProductService {

    Product createProduct(String name);

    void delProduct(String name);

    void editProduct(String name, String newName);

    void save(ProductDTO products);

    ProductDTO loadProduct();
}
