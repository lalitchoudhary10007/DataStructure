package com.lalit.ljava.inheritance;

//at time of object creation of parent by default it
// calls constructor of child class then constructor will be called of parent
public class Child extends ParentAbstract {

    //if there is parameterised constructor of abstract class then we have to call using super keyword

    Child(){
        super(2);
        System.out.println("Constructor of parent class");
    }

    void display(int a){
        //method overriding if we call method display then method of this parent class will be called
        //to call child class display we again have to use super
       // super.display();
        System.out.println("Child class display");
    }

    public static void main(String[] args) {
      new Child().display(1);
    }


}
