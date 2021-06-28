package service;

import domain.Product;
import domain.ProductCard;
import domain.Shop;

import java.util.List;

public interface ShopService {

    ProductCard addProduct(Product product, Integer amount, Integer price);

    void removeProduct(Product product, Integer amount);

    void editProduct(Product product, Integer price);

    Shop createShop(String name);

    void delShop(String name);

    void editShop(String name);

    List<Product> getAllProducts();

    Product getProduct(String name);

    void save();




}
