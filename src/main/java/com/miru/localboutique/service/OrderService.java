package com.miru.localboutique.service;

import com.miru.localboutique.model.Order;

public interface OrderService {
    Iterable<Order> getAllOrders();

    Order create(Order order);

    void update(Order order);
}
