package me.study.designpattern.factorymethod;

public class BlackshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
