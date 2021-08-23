package DAY19;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Java_Big_Int {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inp = new Scanner(System.in);
        BigInteger A = inp.nextBigInteger();
        BigInteger B = inp.nextBigInteger();
        System.out.print(A.add(B));
        System.out.println();
        System.out.println(A.multiply(B));   
        inp.close();

    }
}
