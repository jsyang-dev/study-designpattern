package me.study.pattern.factorymethod.example.idcard;

import me.study.pattern.factorymethod.example.framework.Factory;
import me.study.pattern.factorymethod.example.framework.Product;

import java.util.Vector;

public class IDCardFactory extends Factory {
    private Vector owners = new Vector();
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
    public Vector getOwners() {
        return owners;
    }
}
