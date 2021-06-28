package service;

import domain.Product;

public interface CategoryService {

    Product addProduct(Product product);

    void removeProduct(Product product);

}
