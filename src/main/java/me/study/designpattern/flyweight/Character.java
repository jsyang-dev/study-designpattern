package me.study.designpattern.flyweight;

public class Character {

    private final char value;

    private final String color;

    private final Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }

    @Override
    public String toString() {
        return "Character{" +
                "value=" + value +
                ", color='" + color + '\'' +
                ", font=" + font +
                '}';
    }
}
