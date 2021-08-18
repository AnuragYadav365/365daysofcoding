//HackerRank -- https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?h_r=next-challenge&h_v=zen
package DAY09;
import java.util.*;

public class Java_stdin_out {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        input.close();
        
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}