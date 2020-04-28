package com.kodilla.exception.homework;

import com.kodilla.exception.homework.OrderDoesntExistException;
import com.kodilla.exception.homework.Warehouse.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WarehouseApp {

    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();
        Warehouse warehouse = new Warehouse(orderList);
        warehouse.addOrder(new Order("1001"));
        warehouse.addOrder(new Order("1002"));
        warehouse.addOrder(new Order("1003"));
        warehouse.addOrder(new Order("1004"));



        try {

            String no = giveOrderNumber();
            System.out.println(no);
            boolean isOrderPlaced = warehouse.isOrderInWarehouse("1001");
            System.out.println("Order status : " + isOrderPlaced);
            System.out.println("Please collect your order in Warehouse Dipatch Spot.");
        } catch (Exception e) {

            System.out.println("Sorry, this order is not in Warehouse yet.");
        } finally {
            System.out.println("Thank you for your... bla bla bla");

        }
    }

    public static String giveOrderNumber () {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(" Enter number of your order ");
            String s = scanner.nextLine();
            try {
                Integer.parseInt(s);
                return s;
            } catch (Exception e) {
                System.out.println(" Wrong number. Enter digits without empty spaces or separators. Please try again.");
            }
        }

    }
}


