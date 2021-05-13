package com.lalit.ljava.inheritance.multiInheritance.Interfaces;

public class Child implements A, B{

    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }

    @Override
    public void show() {
        A.super.show();
        B.super.show();
    }
}
