package pe.edu.upao.ejerciciopropuesto.service;

import pe.edu.upao.ejerciciopropuesto.models.Food;
import pe.edu.upao.ejerciciopropuesto.models.Order;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class OrderService {
    private List<Order> orders= new ArrayList<>();


    public void addOrder(String customerName, String customerEmail, List<Food> items) {
        int id = orders.size() + 1;
        String status = "En proceso";
        LocalDateTime creationTime = LocalDateTime.now();
        LocalDateTime estimatedDeliveryTime = creationTime.plusMinutes(30);
        Order order = new Order(id, customerName, customerEmail, status, creationTime,
                estimatedDeliveryTime, items);
        orders.add(order);
    }

    public String getOrderStatus(int orderId) {
        for (Order order : orders) {
            if (order.getId() == orderId) {
                return order.getStatus();
            }
        }
        return "Pedido no encontrado";
    }

    public double getOrderTotal(int orderId) {
        for (Order order : orders) {
            if (order.getId() == orderId) {
                double total = 0;
                for (Food item : order.getItems()) {
                    total += item.getPrice();
                }
                return total;
            }
        }
        return 0;
    }
}