package com.lalit.ljava.whiteboard;

import java.util.Scanner;

public class PrimeNoOrNot {

    //prime no's are 1 & self divided

    public static void main(String[] args) {

        int prime = 6;
        boolean isPrime = true;
        for (int i = 2; i < prime - 1 ; i++){
            if (prime % i == 0){
                isPrime = false;
            }
        }

        if (isPrime){
            System.out.println("No. Is Prime");
        }else {
            System.out.println("No. Is Not Prime");
        }


    }

}