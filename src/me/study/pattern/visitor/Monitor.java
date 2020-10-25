package me.study.pattern.visitor;

public class Monitor implements ComputePart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
