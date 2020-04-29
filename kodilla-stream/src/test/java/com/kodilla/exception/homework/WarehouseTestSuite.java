package com.kodilla.exception.homework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.exception.homework.Warehouse.*;
import static org.junit.Assert.*;

public class WarehouseTestSuite {

    @Test
    public void testaddOrder() {
        //given
        List<Order> orderList = new ArrayList<>();
        Warehouse warehouse = new Warehouse(orderList);
        Order tenOOne = new Order("1001");
        warehouse.addOrder(tenOOne);


        //when
        int result = warehouse.orders.size();
        System.out.println(result);
        //then
        assertEquals(1, result);
    }

    @Test
    public void testaddNextOrderWithTheSameNumber() {
        //given
        List<Order> orderList = new ArrayList<>();
        Warehouse warehouse = new Warehouse(orderList);
        Order tenOOne = new Order("1001");
        warehouse.addOrder(tenOOne);

        Order tenOTwo = new Order("1001");
        warehouse.addOrder(tenOTwo);


        //when
        int result = warehouse.orders.size();
        //then
        assertEquals(1, result);
    }
    @Test(expected = OrderDoesntExistException.class)
    public void testisOrder () throws OrderDoesntExistException {

        //given
        List<Order> orderList = new ArrayList<>();
        Warehouse warehouse = new Warehouse(orderList);
        warehouse.addOrder(new Order("1111"));
        //when
        boolean isOrderPlaced = warehouse.isOrderInWarehouse("1");
        //then
    }


    @Test(expected = OrderDoesntExistException.class)
    public void testisOrder_withException () throws OrderDoesntExistException {

        //given
        List<Order> orderList = new ArrayList<>();
        Warehouse warehouse = new Warehouse( orderList);
        warehouse.addOrder(new Order("1111"));
        //when
        boolean isOrderPlaced = warehouse.isOrderInWarehouse("2222");
        //then
        assertTrue(isOrderPlaced);
    }


}
