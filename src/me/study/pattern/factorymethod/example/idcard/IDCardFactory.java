package me.study.pattern.factorymethod.example.idcard;

import me.study.pattern.factorymethod.example.framework.Factory;
import me.study.pattern.factorymethod.example.framework.Product;

import java.util.ArrayList;

public class IDCardFactory extends Factory {
    private ArrayList<String> owners = new ArrayList<>();
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
    public ArrayList<String> getOwners() {
        return owners;
    }
}
