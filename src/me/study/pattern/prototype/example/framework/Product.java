package me.study.pattern.prototype.example.framework;

public interface Product extends Cloneable {
    void use(String s);
    Product createClone();
}
