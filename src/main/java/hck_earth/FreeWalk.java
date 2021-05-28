package hck_earth;

public class FreeWalk {

    //Que - https://www.hackerearth.com/problem/algorithm/free-walk-0f675f40-0d59a400/

    public static void main(String[] args) {
        walk("AAAA?C"); //5 anti, 2 clock
    }

    static int walk(String s) {
        int walk = 0;
        int maxA = 0;
        int maxC = 0;
        int currA = 0;
        int currC = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') { // if walk in Anti clokwise
                maxA++;
                maxC--;
            }
            if (s.charAt(i) == 'C') { //if walk in clockwise
                maxC++;
                maxA--;
            }
            if (s.charAt(i) == '?') { //if walk in both directions
                maxA++;
                maxC++;
            }
        }

        currA = Math.max(maxA, currA);
        currC = Math.max(maxC, currC);

        System.out.println("maxA:- " + currA + "maxC:- " + currC);

        System.out.println("result:- " + Math.max(currA, currC));

        return walk;
    }

}
