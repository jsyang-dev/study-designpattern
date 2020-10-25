package me.study.pattern.visitor;

public class Computer implements ComputePart {

    ComputePart[] parts;

    public Computer() {
        parts = new ComputePart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputePart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
