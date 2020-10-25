package me.study.pattern.visitor;

public class Keyboard implements ComputePart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
