package me.study.designpattern.templatemethod;

public class Multiply implements Operator {

    @Override
    public int getResult(int result, int number) {
        return result * number;
    }
}
