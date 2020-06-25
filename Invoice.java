package com.kodilla.hibernate.invoice;

import com.kodilla.hibernate.invoice.Item;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "INVOICE")
public class Invoice {
    private int id;
    private String number;
    private List<Item> items = new ArrayList<>();

    @OneToMany(
            targetEntity = Item.class,
            cascade = CascadeType.ALL,
            mappedBy = "id",
            fetch = FetchType.LAZY)

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) { this.items = items; }

    public Invoice() {
    }

    public Invoice(int id, String number) { this.id = id; this.number = number; }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "INVOICE_ID")
    public int getId() {
        return id;
    }

    @Column(name = "INVOICE_NUMBER", unique = true)
    public String getNumber() {
        return number;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setNumber(String number) {
        this.number = number;
    }
}