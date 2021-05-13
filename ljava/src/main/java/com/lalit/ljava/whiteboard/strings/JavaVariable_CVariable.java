package com.lalit.ljava.whiteboard.strings;

public class JavaVariable_CVariable {
    //problem is change java variable to C++ or vice versa
    //this_is_variable -- to Java -- thisIsVariable
    //pr thisIsVariable -- to C++ -- this_is_variable


    public static void main(String[] args) {

        System.out.println("Java Is:- " + changeVariable("this_is_variable"));
        System.out.println("C++ is:- "+ changeVariable("thisIsVariable"));
    }


    public static String changeVariable(String variable) {
        //input -- this_is_variable
        //output -- thisIsVariable
        StringBuilder result = new StringBuilder();
        if (variable.contains("_")) {
            for (int i = 0; i < variable.toCharArray().length; i++) {
                if (i != 0 && variable.charAt(i - 1) == '_') {
                    result.append(Character.toUpperCase(variable.charAt(i)));
                    continue;
                } else if (variable.charAt(i) != '_') {
                    result.append(variable.charAt(i));
                }
            }
        }else {
            //output -- this_is_variable
            //input -- thisIsVariable
            for (int i = 0; i < variable.toCharArray().length; i++){
                if (variable.charAt(i) == Character.toUpperCase(variable.charAt(i))){
                    result.append("_").append(Character.toLowerCase(variable.charAt(i)));
                }else {
                    result.append(variable.charAt(i));
                }
            }
        }
        return result.toString();
    }

}
