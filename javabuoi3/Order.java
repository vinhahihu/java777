package javabuoi3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final int orderID;
    private LocalDate orderDate;
    private List<Orderdetail> lineItems;
    private int count;
    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.lineItems = new ArrayList<>();
        this.count = 20;
    }
    
    public List<Orderdetail> getLineItems() {
        return lineItems;
    }
    
    public LocalDate getOrderDate() {
        return orderDate;
    }
    
    public int getOrderID() {
        return orderID;
    }
    
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    
    public void addLineItem(Product product, int quantity) {
        lineItems.add(new Orderdetail(product, quantity));
    }
    
    public double calcTotalCharge() {
        double totalCharge = 0;
        for (Orderdetail item : lineItems) {
            totalCharge += item.calcTotalPrice();
        }
        return totalCharge;
    }
    
    @Override
    public String toString() {
        return "Order ID: " + orderID + ", Order Date: " + orderDate + ", Total Charge: " + calcTotalCharge();
    }

}
