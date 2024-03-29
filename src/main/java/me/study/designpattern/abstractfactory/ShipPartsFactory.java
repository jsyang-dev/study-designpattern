package me.study.designpattern.abstractfactory;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
