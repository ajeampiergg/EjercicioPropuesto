package pe.edu.upao.ejerciciopropuesto.models;

import java.time.LocalDateTime;
import java.util.List;

public class Order {
    int id;
    String customerName;
    String customerEmail;
    String status;
    LocalDateTime creationTime;
   LocalDateTime estimateDeliveryTime;
   List<Food> items;

    public Order(int id, String customerName, String customerEmail, String status, LocalDateTime creationTime, LocalDateTime estimateDeliveryTime, List<Food> items) {
        this.id = id;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.status = status;
        this.creationTime = creationTime;
        this.estimateDeliveryTime = estimateDeliveryTime;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public LocalDateTime getEstimateDeliveryTime() {
        return estimateDeliveryTime;
    }

    public List<Food> getItems() {
        return items;
    }
}
