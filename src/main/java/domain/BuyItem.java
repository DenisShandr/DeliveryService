package domain;

public class BuyItem {

    private Product product;
    private Integer amount;
    private Shop shop;

    public BuyItem(Product product, Integer amount, Shop shop) {
        this.product = product;
        this.amount = amount;
        this.shop = shop;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }
}
