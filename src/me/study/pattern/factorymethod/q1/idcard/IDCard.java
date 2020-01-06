package me.study.pattern.factorymethod.q1.idcard;

import me.study.pattern.factorymethod.q1.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int id;
    IDCard(String owner, int id) {
        System.out.println(owner + "(" + id + ")의 카드를 만듭니다.");
        this.owner = owner;
        this.id = id;
    }
    public void use() {
        System.out.println(owner + "(" + id + ")의 카드를 사용합니다.");
    }
    public String getOwner() {
        return owner;
    }
    public int getId() {
        return id;
    }
}
