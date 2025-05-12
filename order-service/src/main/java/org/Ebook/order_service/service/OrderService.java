package org.Ebook.order_service.service;

import org.Ebook.order_service.entity.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderService {
    private final Map<String, Order> orderStore = new HashMap<>();

    public List<Order> getAllOrders() {
        return new ArrayList<>(orderStore.values());
    }

    public Order getOrderById(String orderId) {
        return orderStore.get(orderId);
    }

    public Order createOrder(Order order) {
        orderStore.put(order.getOrderId(), order);
        return order;
    }

    public Order updateOrder(String orderId, Order updatedOrder) {
        orderStore.put(orderId, updatedOrder);
        return updatedOrder;
    }

    public void deleteOrder(String orderId) {
        orderStore.remove(orderId);
    }
}
