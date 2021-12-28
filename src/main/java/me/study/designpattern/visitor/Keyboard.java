package me.study.designpattern.visitor;

public class Keyboard implements ComputePart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
