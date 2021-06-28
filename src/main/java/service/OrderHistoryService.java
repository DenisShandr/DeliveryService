package service;

import domain.Order;

import java.util.List;

public interface OrderHistoryService {

    Order addOrder(Order order);

    void save(List<Order> orders);

}
