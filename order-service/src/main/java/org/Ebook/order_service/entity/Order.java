package org.Ebook.order_service.entity;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    private String orderId;
    private String userId;
    private List<String> bookIds;
    private LocalDateTime orderDate;
    private double totalAmount;

    public Order() {}

    public Order(String orderId, String userId, List<String> bookIds, LocalDateTime orderDate, double totalAmount) {
        this.orderId = orderId;
        this.userId = userId;
        this.bookIds = bookIds;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<String> getBookIds() {
        return bookIds;
    }

    public void setBookIds(List<String> bookIds) {
        this.bookIds = bookIds;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}