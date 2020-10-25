package me.study.pattern.visitor;

public interface ComputePart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
