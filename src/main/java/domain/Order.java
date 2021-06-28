package domain;

import java.util.Date;

public class Order {

    private Cart cart;
    private Date orderDate;
    private Client client;
    private Address address;

    public Order(Cart cart, Date orderDate, Client client, Address address) {
        this.cart = cart;
        this.orderDate = orderDate;
        this.client = client;
        this.address = address;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
