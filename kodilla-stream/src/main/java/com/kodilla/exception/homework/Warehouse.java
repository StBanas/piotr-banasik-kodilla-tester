package com.kodilla.exception.homework;

import java.util.*;

public class Warehouse {
    List<Order> orders;

    public Warehouse(List<Order> orders) { this.orders = orders; }

    public List<Order> orderList = new ArrayList<>();

    public List<Order> getOrderList() { return orderList; }

    public void addOrder(Order order) {
        getOrderList().add(order);
    }

    public boolean isOrderInWarehouse (String number) throws OrderDoesntExistException {

        if (getOrderList().contains(getOrder(number))) {
            return true;
        }
        throw new OrderDoesntExistException();
    }

    public Order getOrder(String number) {
        return getOrderList()
                .stream()
                .filter(o -> o.getNumber().contains(number))
                .findAny().get();
    }
}




