package whiteboard;

public class PrimeNoOrNot {

    //prime no's are 1 & self divided

    public static void main(String[] args) {

        int prime = 7;
        boolean isPrime = true;
        for (int i = 2; i < prime - 1 ; i++){
            if (prime % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime){
            System.out.println("No. Is Prime");
        }else {
            System.out.println("No. Is Not Prime");
        }


    }

}
