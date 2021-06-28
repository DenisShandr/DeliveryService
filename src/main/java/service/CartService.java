package service;

import domain.BuyItem;
import domain.Product;
import domain.Shop;

public interface CartService {

    BuyItem addBuyItem(Shop shop, Product product, Integer amount);

    void removeProductFromCart(Product product, Integer amount);

    Integer getTotalPrice(Integer shopPrice, Integer amount);

}
