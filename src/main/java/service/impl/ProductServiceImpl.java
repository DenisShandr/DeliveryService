package service.impl;

import domain.Client;
import domain.Product;
import dto.ClientDTO;
import dto.ProductDTO;
import repo.ProductRepo;
import repo.impl.ProductFileSystemRepo;
import service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private static ProductRepo repo = new ProductFileSystemRepo();

    @Override
    public Product createProduct(String name) {
        return new Product(name);
    }

    @Override
    public void delProduct(String name) {
        repo.deleteProduct(name);
    }

    @Override
    public void editProduct(String name, String newName) {
        List<Product> products = repo.getProduct().getProducts();
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).getName().equals(name)){
                products.set(i,new Product(newName));
            }
        }
        repo.saveProduct(new ProductDTO(products));
    }

    @Override
    public void save(ProductDTO products) {
        repo.saveProduct(products);
    }

    @Override
    public ProductDTO loadProduct() {
        return repo.getProduct();
    }
}
