package service;

import domain.Address;

public interface OrderService {

    Address getAddress(String street, Integer home, Integer flat, Integer postCode);

    void completeOrder();

}
