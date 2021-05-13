package com.lalit.ljava.inheritance.multiInheritance;

public class C //extends A, B
 {

    //here you can see both parent calss having the function with same name
    //so if java supports multi inheritence and we call fun then compile will be unable to decide
    //which method to be called

    public static void main(String[] args) {
       C c = new C();
      // c.fun();
    }

}
