package me.study.pattern.stratege;

public class Character {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack() {
        this.weapon.doAttack();
    }
}
