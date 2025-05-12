package org.Ebook.order_service.controller;

import org.Ebook.order_service.entity.Order;
import org.Ebook.order_service.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService=orderService;
    }

    @GetMapping
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable String id){
        return orderService.getOrderById(id);
    }

    @PostMapping
    public Order getOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @PutMapping("/{id}")
    public Order updateOrder(@PathVariable String id, @RequestBody Order order){
        return orderService.updateOrder(id, order);
    }

    @DeleteMapping("/{id}")
    public void deleteOrder(@PathVariable String id){
        orderService.deleteOrder(id);
    }
}
