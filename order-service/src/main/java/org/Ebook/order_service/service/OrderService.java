package org.Ebook.order_service.service;

import org.Ebook.common_entities.entities.Order;
import org.Ebook.common_entities.exception.OrderNotFoundException;
import org.Ebook.order_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long orderId) {
        return orderRepository.findById(orderId)
                .orElseThrow(() -> new OrderNotFoundException(orderId));
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order updateOrder(Long orderId, Order updatedOrder) {
        Order existingOrder= orderRepository.findById(orderId)
                .orElseThrow(()-> new OrderNotFoundException(orderId));

        existingOrder.setOrderDate(updatedOrder.getOrderDate());
        existingOrder.setBooks(updatedOrder.getBooks());
        existingOrder.setUser(updatedOrder.getUser());
        existingOrder.setTotalAmount(updatedOrder.getTotalAmount());

        return orderRepository.save(existingOrder);
    }

    public void deleteOrder(Long orderId) {
       orderRepository.deleteById(orderId);
    }
}
