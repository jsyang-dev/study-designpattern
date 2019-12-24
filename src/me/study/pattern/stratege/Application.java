package me.study.pattern.stratege;

public class Application {
    public static void main(String[] args) {
        Character character = new Character();

        character.setWeapon(new Sword());
        character.attack();

        character.setWeapon(new Bow());
        character.attack();

        character.setWeapon(new Ax());
        character.attack();
    }
}
