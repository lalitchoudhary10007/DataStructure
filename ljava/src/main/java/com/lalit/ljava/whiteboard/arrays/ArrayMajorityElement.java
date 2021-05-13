package com.lalit.ljava.whiteboard.arrays;

import java.util.Arrays;

public class ArrayMajorityElement {

    //find the majority element count if count is greater then total length array return element
    //if majority count is not greater then length of array return -1


    public static void main(String[] args) {
        System.out.print("Majority Element :- " + ArrayMajorityElement(new int[]{1, 3, 3, 5, 3, 1, 3,8}));
    }


    // with array sorted
    private static int MajorityElement(int[] input) {
        // int[] in = {1,3,3,5,3,1,3};
        int result = -1;
        int tempCount = 0;
        int tempElement = input[0];
        Arrays.sort(input);
        for (int i = 0; i < input.length; i++) {
            if (tempElement == input[i]) {
                tempCount++;
            } else {
                tempCount = 1;
                tempElement = input[i];
            }

            if (tempCount > input.length / 2) {
                result = tempElement;
            }

        }
        return result;
    }

    //without sort array
    //another solution is by using hash map
    private static int ArrayMajorityElement(int[] input) {
        // int[] in = {1,3,3,5,3,1,3};
        int maxCount = 0;
        int element = 0;
        for (int i = 0; i < input.length; i++) {
            int count = 0;
            for (int j = 0; j < input.length; j++) {
                if (input[i] == input[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                element = input[i];
            }
        }
        return maxCount > input.length / 2 ? element : -1;
    }

}
