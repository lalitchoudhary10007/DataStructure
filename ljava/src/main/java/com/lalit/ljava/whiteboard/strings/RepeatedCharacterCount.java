package com.lalit.ljava.whiteboard.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class RepeatedCharacterCount {
    //problem -- check the count of repeated chars in string
    //retrun string with count

    public static void main(String[] args) {

        System.out.print("Input with count:- "+countCharacter("lalit"));

    }

    public static String countCharacter(String input) {
        StringBuilder result = new StringBuilder();
        char[] inputArray = input.toCharArray();
        Arrays.sort(inputArray);
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            if (map.containsKey(inputArray[i])) {
                map.put(inputArray[i], map.get(inputArray[i]) + 1);
            } else {
                map.put(inputArray[i], 1);
            }
        }
        for (Character key : map.keySet()) {
            result.append(key +""+map.get(key));
        }
        return result.toString();
    }

}
