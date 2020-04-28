package com.kodilla.exception.homework;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.exception.homework.Warehouse.*;
import static org.junit.Assert.assertEquals;

public class WarehouseTestSuite {

    @Test
    public void testaddOrder() {
        //given
        List<Order> orderList = new ArrayList<>();
        Warehouse warehouse = new Warehouse(orderList);
        Order tenOOne = new Order("1001");
        warehouse.addOrder(tenOOne);


        //when
        int result = warehouse.orderList.size();
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
        int result = warehouse.orderList.size();
        //then
        assertEquals(1, result);
    }
}
