package me.study.designpattern.visitor;

public interface ComputePart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
