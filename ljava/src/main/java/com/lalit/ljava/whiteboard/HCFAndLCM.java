package com.lalit.ljava.whiteboard;

public class HCFAndLCM {

    public static void main(String[] args) {
        int a = 72;
        int b = 120;
        int hcf = 0;

        for(int i = 1; i <= a || i <= b ; i++){
            if (a%i == 0 && b%i ==0){
                hcf = i;
            }
        }

        System.out.println("HSCF is:- "+hcf);
        System.out.println("LCM is:- "+(a*b)/hcf);

    }


}
