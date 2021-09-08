package DAY35.HackerRank;

import java.util.Scanner;
import java.math.BigInteger;

public class primarility {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger n = scan.nextBigInteger();
        scan.close();

        if(n.isProbablePrime(1)){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}
