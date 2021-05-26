package whiteboard;

import java.util.Arrays;

public class FibonacciSeries {

    //0 1 1 2 3 5 8 13 21

    public static void main(String[] args) {

//        int first = 0;
//        int second = 1;
//        for (int i = 0; i < 5; i++) {
//            System.out.println(first);
//            int tot = first + second;
//            first = second;
//            second = tot;
//        }


        int[] f = new int[5];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < 5; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        System.out.println(Arrays.toString(f));

    }

}
