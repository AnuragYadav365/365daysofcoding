package DAY35.HackerRank;
import java.util.Scanner;

class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    public long power(int a, int b){
        if(a != 0 & b !=0){
            if(a>0 & b>0){
                int result = 1;
                while (b!= 0) {
                    result *= a;
                    --b;
                }
                return result;
            }

            else{
                throw new ArithmeticException("java.lang.Exception: n or p should not be negative.");
            }
        }
        else if(a == 0 & b != 0){
            return 0;
        }

        else if(b == 0 & a != 0){
            return 1;
        }
        else{
            throw new ArithmeticException("java.lang.Exception: n and p should not be zero.");
        }
    }
}

public class java_exc_handling2 {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
