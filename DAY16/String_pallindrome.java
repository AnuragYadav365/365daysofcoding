package DAY16;
import java.util.Scanner;

public class String_pallindrome {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String A = inp.nextLine();
        inp.close();

        //Coberting string to char array and then reversing
        char[] arr = A.toCharArray();
        char[] arr2 = new char[A.length()];

        for(int i=0; i<A.length(); i++){
            arr2[i] = arr[A.length() - (i + 1)];
        }

        // System.out.println(String.valueOf(arr));
        // System.out.println(String.valueOf(arr2));

        String ans = new String();
        for(int j = 0; j<A.length(); j++){
            if(arr[j] == arr2[j]){
                ans = "Yes";
                continue;
            }
            else{
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
    }
}
