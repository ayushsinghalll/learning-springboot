package org.example;

import java.util.Map;

public class Customer {
    private int Id;
    private Map<Integer,String> products;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Map<Integer, String> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, String> products) {
        this.products = products;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "Id=" + Id +
                ", products=" + products +
                '}';
    }



}
