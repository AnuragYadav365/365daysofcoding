package DAY35.HackerRank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class java_exc_handling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        try{
            x = scan.nextInt();
            y = scan.nextInt();
            try{
                int div = x/y;
                System.out.println(div);
            }
            catch(ArithmeticException exc){
                System.out.println("java.lang.ArithmeticException: / by zero");
            }
        }
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        scan.close();
    }
}
