package DAY06;
import java.util.Scanner;
import java.util.InputMismatchException;

public class exp_int {
    public static void main(String[] args) {
        
        int Day;
        Scanner Val = new Scanner(System.in);
        System.out.println("Enter an integer value: ");

        //Check whether the user had entered integer value or not
        try {
            Day = Val.nextInt();
            System.out.println("You entered a number " + Day);
        } 

        //catchinf error if user enter another datatype value(other than int)
        catch (InputMismatchException e) {
            System.out.println("Wrong entry! You must enter an integer value");
        }

        

        Val.close();
    }
}