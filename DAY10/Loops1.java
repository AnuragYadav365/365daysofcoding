package DAY10;

import java.util.Scanner;

public class Loops1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        //Print multiples of N 10 times
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d %s %d %s %d", N, "x", i , "=", N*i);
            System.out.println();
        }
        input.close();
    }
}
