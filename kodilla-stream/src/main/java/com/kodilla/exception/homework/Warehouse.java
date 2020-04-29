package com.kodilla.exception.homework;

import java.util.*;

public class Warehouse {
    List<Order> orders;

    public Warehouse(List<Order> orders) {
        this.orders = orders;
    }

    public void addOrder(Order order) {
        checkUniqueness(order);
    }

    public boolean isOrderInWarehouse(String number) throws OrderDoesntExistException {

        if (orders.contains(getOrder(number)))
        {  return true;
//        }
//        Order order = getOrder(number);
//        if (order != null) {
//            return true;
        }
        return false;
    }
    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders
                .stream()
                .filter(o -> number.equals(o.getNumber()))
                .findFirst().orElseThrow(OrderDoesntExistException::new);
    }

    public void checkUniqueness(Order order) {
        boolean isUnique = true;
        for (Order o : orders) {
            if (o.getNumber().equals(order.number)) {
                System.out.println("This order is already on the list");
                isUnique = false;
            }
        }
        if (isUnique) {
            orders.add(order);
        }
    }
}




