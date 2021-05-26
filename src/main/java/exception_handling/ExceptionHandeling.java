package exception_handling;

public class ExceptionHandeling {
    //finally block will execute always may be exception is handled or not
    //if exception is handled then it will move further
    //exception is not handled then it will not move further only finally block will execute

    public static void main(String[] args) {

        try {
            int c = 10 / 0 ;
            System.out.println("try block :- ");
        }
//        catch (Exception e) {
//            System.out.println("Exception block :- " + e);
//        }
        finally {
            System.out.println("Finally block :- ");
        }

        System.out.println("Code Executes more");
        System.out.println("Code Executes more");
    }

}
