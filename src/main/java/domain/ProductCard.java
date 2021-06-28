package domain;

public class ProductCard {

    private Product product;
    private Integer amount;
    private Integer price;

    public ProductCard(Product product, Integer amount, Integer price) {
        this.product = product;
        this.amount = amount;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
