package com.lalit.ljava.whiteboard.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WaveSortArray {

    public static void main(String[] args) {

//       Integer a = 100, b = 100;
//       System.out.println(a == b);
//
//       Integer c = 128, d = 128;
//       System.out.println(c == d);


        String input1 = "5";
        String input2 = "1000000001 1000000002 1000000003 1000000004 1000000005";
//        List<Object> list = Arrays.asList(input2.split(" ")).stream().map(new Function<String, Object>() {
//            @Override
//            public Object apply(String i) {
//                return Long.parseLong(i);
//            }
//        }).collect(Collectors.toList());

        List<Long> list = Arrays.asList(input2.split(" ")).stream().map(i -> Long.parseLong(i)).collect(Collectors.toList());
        System.out.println("list input :- "+list);

        long sum = 0L;
        for (String s : Arrays.asList(input2.split(" "))) {
            long parseInt = Integer.parseInt(s);
            sum += parseInt;
        }
        System.out.println("Sum:- "+sum);
    }


}
