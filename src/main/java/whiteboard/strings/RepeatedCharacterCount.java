package whiteboard.strings;

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
        for (char c : inputArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        for (Character key : map.keySet()) {
            result.append(key).append(map.get(key));
        }
        return result.toString();
    }

}
