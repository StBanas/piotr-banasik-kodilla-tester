package com.kodilla.hibernate.invoice.repository;

import com.kodilla.hibernate.invoice.Product;
import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.repository.InvoiceRepository;
import com.kodilla.hibernate.invoice.repository.ProductRepository;
import com.kodilla.hibernate.invoice.repository.ItemRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceRepositoryTestSuite {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void testInvoiceToItemManyToMany(){
        //Given
        Product mesel = new Product(1, "MESEL");
        Product hebel = new Product(2, "HEBEL");

        Invoice invoice1 = new Invoice(101, "101");
        Invoice invoice2 = new Invoice(102, "102");

        Item item1 = new Item(1, mesel, BigDecimal.valueOf(100 ),2, BigDecimal.valueOf(200));
        Item item2 = new Item(2, hebel, BigDecimal.valueOf(200) ,3, BigDecimal.valueOf(600));

        mesel.getItems().add(item1);
        hebel.getItems().add(item2);


        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
//        invoice2.getItems().add(item1);
//        invoice2.getItems().add(item2);


        //When
        productRepository.save(hebel);
        int down = hebel.getId();
        productRepository.save(mesel);
        int up = mesel.getId();
//        itemRepository.save(item1);
//        int left = item1.getId();
//        itemRepository.save(item2);
//        int right = item2.getId();


        //Then
        Assert.assertNotEquals(0, down);
        Assert.assertNotEquals(0, up);

//        Assert.assertNotEquals(0, down);
//        Assert.assertNotEquals(0, up);
//
//        Assert.assertNotEquals(0, left);
//        Assert.assertNotEquals(0, right);

//        Assert.assertNotEquals(0, left);
//        Assert.assertNotEquals(0, right);

        // CleanUp
        try {
            productRepository.deleteAll();
//            productRepository.deleteById(up);

//            invoiceRepository.deleteById(down);
//            invoiceRepository.deleteById(up);
//
//            itemRepository.deleteById(left);
//            itemRepository.deleteById(right);


        } catch (Exception e) {
            //do nothing
        }
    }
}