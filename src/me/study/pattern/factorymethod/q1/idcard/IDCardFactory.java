package me.study.pattern.factorymethod.q1.idcard;

import me.study.pattern.factorymethod.q1.framework.Factory;
import me.study.pattern.factorymethod.q1.framework.Product;

import java.util.ArrayList;

public class IDCardFactory extends Factory {
    private ArrayList<Product> owners = new ArrayList<>();
    private int id = 1000;
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, id++);
    }
    protected void registerProduct(Product product) {
        owners.add(product);
    }
    public ArrayList<Product> getOwners() {
        return owners;
    }
}
