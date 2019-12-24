package me.study.pattern.stratege;

public class Ax implements Weapon {
    @Override
    public void doAttack() {
        System.out.println("도끼 공격");
    }
}
