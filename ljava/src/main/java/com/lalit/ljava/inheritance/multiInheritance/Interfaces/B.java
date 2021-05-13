package com.lalit.ljava.inheritance.multiInheritance.Interfaces;

public interface B extends Diamond{

    default void show(){
        System.out.println("show method in B");
    }


}
