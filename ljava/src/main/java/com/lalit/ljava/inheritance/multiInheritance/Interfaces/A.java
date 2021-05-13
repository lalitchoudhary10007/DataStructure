package com.lalit.ljava.inheritance.multiInheritance.Interfaces;

public interface A extends Diamond {

    default void show(){
        System.out.println("show method in A");
        Diamond.super.show();
    }



}
