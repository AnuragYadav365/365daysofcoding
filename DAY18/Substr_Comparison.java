package DAY18;

import java.util.Scanner;

public class Substr_Comparison {

    public static String getSmallestAndLargest(String s, int k) {

        int temp = k;
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

        // for(int j =0; j<lastsubstringindex ; j++){
        //     System.out.println(sarr[j]);
        // }

        //random value initialized
        String smallest = sarr[0];
        String largest = sarr[0];


        //lexicologically checking for temp String with every String in sarr 
        //For smallest finding
        for(int m = 0; m<lastsubstringindex; m++){
            for(int n =0; n<temp; n++){
                if(smallest.charAt(n) == sarr[m].charAt(n)){
                    continue;
                }

                else if(smallest.charAt(n) > sarr[m].charAt(n)){
                    smallest = sarr[m];
                    break;
                }

                else{
                    break;
                }
            }
        }

        //For largest finding
        for(int p = 0; p<lastsubstringindex; p++){
            for(int q =0; q<temp; q++){
                if(largest.charAt(q) == sarr[p].charAt(q)){
                    continue;
                }

                else if(largest.charAt(q) < sarr[p].charAt(q)){
                    largest = sarr[p];
                    break;
                }

                else{
                    break;
                }
            }
        }

        return smallest + "\n" + largest;

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        int k = inp.nextInt();
        inp.close();
        String ans = getSmallestAndLargest(s, k);
        System.out.println(ans);
    }
}