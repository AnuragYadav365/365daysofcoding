package DAY15;
import java.io.*;
import java.util.*;

import javax.print.DocFlavor.STRING;


class ALL{
    String String1;
    String String2;
    public ALL(String A, String B){
        this.String1 = A;
        this.String2 = B;
    }

    public void tot_char_Count(){
        //To print the calulcated sum of characters of both strings
        int tot_length = String1.length() + String2.length();
        System.out.println("The total length is: " + tot_length);
    }


    //To check whether string2 comes before string1 lexologically
    public String is_lexological(){
        String Ans = "default";
        String greaterString;
        String smallerString;
        if(String1.length() > String2.length()){
            greaterString = String1;
            smallerString = String2;
        }

        else{
            greaterString = String2;
            smallerString = String1;
        }
        int i;
        for(i = 0; i < smallerString.length(); i++){


            if(smallerString.charAt(i) == greaterString.charAt(i)){
                if(i == (smallerString.length() - 1)){
                    if(smallerString == String1){
                        Ans  = "No";
                    }

                    else{
                        Ans  = "Yes";
                    }
                }
                continue;
            }

            else if(String1.charAt(i) < String2.charAt(i)){
                Ans = "No";
                break;
            }

            else{
                Ans = "Yes";
                break;
            }
            
        }
        System.out.println("Loop Until: " + i);
        return Ans;
    }
    
    //Capitalize both of the Strings in sentence case
    public void converting_to_Char(){
        char[] arr1 = String1.toCharArray();
        char[] arr2 = String2.toCharArray();
        arr1[0] = Character.toUpperCase(arr1[0]);
        arr2[0] = Character.toUpperCase(arr2[0]);
        System.out.println(String.valueOf(arr1) + " " + String.valueOf(arr2));
    }
}

public class String_Intro {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();

        ALL str_intro = new ALL(A, B);
        str_intro.tot_char_Count();
        String lex = str_intro.is_lexological();
        System.out.println("Lexological: " + lex);
        System.out.println("In capitals: ");
        str_intro.converting_to_Char();
        
    }
}

//All done i think