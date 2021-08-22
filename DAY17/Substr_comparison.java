/*
package DAY17;
import java.util.Scanner;

public class Substr_comparison {

    public static void getSmallestAndLargest(String s, int k) {
        String smallest = " ";
        String largest = " ";

        //s.substring(beginIndex);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        //to initialize the array that can hold all the substrings
        int lastsubstringindex = s.length() - (k-1);
        String[] sarr = new String[lastsubstringindex];

        //Loop to get substring using function and putting them in sarr
        for(int i = 0; i<s.length(); i++){
            sarr[i] = s.substring(i, k);
            k++;
            // System.out.println("value of i: " + i + " and k is: " + k);
            if(i==lastsubstringindex - 1){
                break;
            }
        }


        //lexicologically ordering every substring in array sarr
        //return smallest + "\n" + largest;

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        int k = inp.nextInt();
        inp.close();

        getSmallestAndLargest(s, k);
        System.out.println(s + " " + k);
    }
}
*/

//DID not completed