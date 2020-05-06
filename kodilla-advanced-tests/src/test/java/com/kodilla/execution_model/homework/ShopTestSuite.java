package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {

    Shop shop = new Shop();


    @BeforeEach
    public void initializeShop() {
        Order order1 = new Order(123.12, LocalDate.of(2018, 04, 03), "Govin");
        Order order2 = new Order(1.1, LocalDate.of(2019, 04, 02), "Vavin");
        Order order3 = new Order(90.99, LocalDate.of(2019, 06, 03), "Rovin");
        Order order4 = new Order(33.33, LocalDate.of(2020, 04, 04), "Govin");
        Order order5 = new Order(1111.11, LocalDate.of(2020, 04, 05), "Lovin");

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
    }

    @AfterEach
    public void resetValues() {
        System.out.println("Reset");
    }

    @Test
    public void getSizeOfList() {
        //when
        shop.getSize();

        //then
        assertEquals(5, shop.getSize());
    }
    @Test
    public void addingOrdersToShop() {
        //when
        shop.addOrder(new Order(222.32,LocalDate.of (2000,01,01 ), "Logan"));
        int numberOfOrders = shop.getSize();

        //then
        assertEquals(6, numberOfOrders);
    }

    @Test
    public void getAnOrderByDate () { //LocalDate.of(2020,04,02)
        //when
        List<Order> result = shop.getOrderFrom2Years(LocalDate.now());

        //then
        assertEquals(1,result.size() );
    }

    @Test
    public void clearRecords() {
        //when
        shop.clear();

        //then
        assertEquals(0, shop.getSize());
    }
    @Test
    public void getSumOfOrderValues() {
        //when
        double expected = shop.getSumOfAllOrders();

        double sum = 0;
        for (Order order: shop.getOrders()) {
            sum = sum + order.getValue();
        }

        //then
        assertEquals(expected, sum);
    }
    @Test
    public void getValuesFromMinMaxRange() {
        //when
        List<Order> result = shop.getMinMaxOrderRangeByValues(shop.getOrders().get(2), shop.getOrders().get(4));
        System.out.println(result);

        //then
        assertEquals(5, result.size());
    }

}
