package DAY01;
import java.util.Scanner; //import Scanner from util library


public class user_inp {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string you want to output");
        String aStr = input.nextLine();
        System.out.println("-----------------------------------------");
        System.out.println("Your entered String is: ");
        System.out.println(aStr);
        input.close();
    }
    
}
