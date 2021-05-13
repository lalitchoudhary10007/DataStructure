package com.lalit.ljava.whiteboard.arrays;

import java.util.Arrays;
import java.util.LinkedList;

public class ArraySubsetOfAnother {


    public static boolean isSubset2() {
        int[] first = {1, 2, 5, 7, 9, 10};
        int[] second = {5, 1, 9};
        int count = 0;
        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < first.length; j++) {
                if (second[i] == first[j]) {
                    count++;
                    break;
                }
            }
        }
        if (second.length == count) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println("Array is Subset:- " + isSubset2());

    }


    public static boolean isSubset() {

        int[] first = {1, 2, 5, 7, 9, 10};
        int[] second = {5, 1, 89};
        boolean isSubset = true;
        int j = 0;
        for (int i = 0; i < second.length; i++) {
            for (j = 0; j < first.length; j++) {
                if (second[i] == first[j]) {
                    break;
                }
            }
            if (j == first.length) {
                isSubset = false;
            }
        }
       return isSubset;
    }


}
