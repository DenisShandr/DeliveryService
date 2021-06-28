package domain;

import java.util.List;

public class Cart {

    private List<BuyItem> products;

    public Cart() {
    }

    public List<BuyItem> getProducts() {
        return products;
    }

    public void setProducts(List<BuyItem> products) {
        this.products = products;
    }

}
