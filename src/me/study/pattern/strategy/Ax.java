package me.study.pattern.strategy;

public class Ax implements Weapon {
    @Override
    public void doAttack() {
        System.out.println("도끼 공격");
    }
}
