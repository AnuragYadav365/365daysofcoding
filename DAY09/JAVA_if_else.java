//HackerRank -- https://www.hackerrank.com/challenges/java-if-else/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

package DAY09;
// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.regex.*;
import java.util.Scanner;

public class JAVA_if_else {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        //If N is odd, print Weird
        if(N % 2 != 0){
            System.out.println("Weird");
        }

        //If N even and between 2 and 5(inclusive)
        else if(N % 2 == 0 & N>=2 & N<=5){
            System.out.println("Not Weird");
        }

        //If N even and between 6 and 20(inclusive)
        else if(N % 2 == 0 & N>=6 & N<=20){
            System.out.println("Weird");
        }

        //If N is even and greater than 20
        else{
            System.out.println("Not Weird");
        }

        scanner.close();
    }
}
