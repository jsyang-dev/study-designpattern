package me.study.pattern.visitor;

public class Mouse implements ComputePart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
