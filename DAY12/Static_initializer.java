package DAY12;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Static_initializer {
    //Write your code here
    public static boolean flag;
    public static void input(int Breadth, int Height){
        if(Breadth<=0 | Height<=0)
        {
            flag = false;
        }
        else{
            flag = true;
        }
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int B = input.nextInt();
        int H = input.nextInt();

        input(B, H);

        if(flag){
			int area=B*H;
			System.out.print(area);
		}
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        input.close();
		
	}//end of main

}//end of class
