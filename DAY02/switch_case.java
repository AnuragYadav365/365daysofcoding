package DAY02;
import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Who are you?");
        String name = input.nextLine();

        switch(name){
            case "admin":
            System.out.println("Try your real name here!");
            break;

            case "initial coder":
            System.out.println("Welcome initial coder!");
            break;

            default:
            System.out.println("You entered wrong name!");
        }

        input.close();

    }
}
