package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }


    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrderFrom2Years(LocalDate day) {
        List<Order> dateOrders = getOrders().stream()
                .filter(o -> o.getDate().isBefore(day.minus(Period.ofYears(2))))
                .collect(Collectors.toList());
        return dateOrders;
    }

    public List<Order> getMinMaxOrderRangeByValues(Order first, Order last) {
//
//        if (first.getValue() > last.getValue()) {
//            double firstTemp = last.getValue();
//        }
//
//        for (int i = getOrders().indexOf(first); i < getOrders().indexOf(last); i++) {
//            List<Order> listOrders = new ArrayList<>();
//            listOrders.add(getOrders().get(i));
//            return listOrders;
//        }
//        return null;
//    }

        List<Order> listOrders = new ArrayList<>();
        for (Order o : getOrders()) {
            double value = o.getValue();
            if ((value > first.getValue()) || (value < last.getValue())) {
                listOrders.add(o);
            }
        }
        return listOrders;
    }


    public double getSumOfAllOrders() {
        double sumOrders = getOrders()
                .stream()
                .map(u -> u.getValue())
                .mapToDouble(n -> n)
                .sum();
        return sumOrders;
    }

    public void clear() {
        this.orders.clear();
    }

    public int getSize() {
        return this.orders.size();
    }
}
