package me.study.pattern.visitor;

public class VisitorPatternDemo {

    public static void main(String[] args) {
        ComputePart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
