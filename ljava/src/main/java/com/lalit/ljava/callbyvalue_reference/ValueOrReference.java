package com.lalit.ljava.callbyvalue_reference;

public class ValueOrReference {

    //java supports call by value

    public static void main(String[] args) {

        //case 1 primitives
        int a = 1 ;
        changePrimitives(a);
        System.out.println("After sending in method :- "+a); //original a is not changed

        //case 2 objects references
        Pointer p = new Pointer(0);
        System.out.println("Original Pointer value :- "+p.pointerInner); // original is 0
        changeObjectRef(p); //we pass 0 in method and we changed this values in method
        System.out.println("After passing Pointer value :- "+p.pointerInner);
       ///so in case of object references we send copy of refernece as value hence it's value is changed
    }


    public static void changePrimitives(int aCopy){
        aCopy = 12 ; //changed the copy of a variable not a variable changed
        System.out.println("Copy of variable a :- "+aCopy);
    }


    public static void changeObjectRef(Pointer pointerCopy){
        pointerCopy.pointerInner = 12; //we changed value so it will change the original reference
        System.out.println("After change Pointer value :- "+pointerCopy.pointerInner);
    }

}
