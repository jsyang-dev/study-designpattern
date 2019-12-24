package me.study.pattern.stratege;

public class Bow implements Weapon {
    @Override
    public void doAttack() {
        System.out.println("활 공격");
    }
}
