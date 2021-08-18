package DAY03;
import java.util.Scanner;

class Info{

    String username;

    void display(){
        System.out.println("Welcome user " + username);
    }

    int remdays(int d){
        int leftDays = 365 - d;
        return leftDays;
    }
}

public class return_type{
    public static void main(String[] args) {
        
        Info user1 = new Info();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        user1.username = input.nextLine();
        user1.display();
        System.out.println();

        System.out.println("Enter the number of days spent: ");
        int days = input.nextInt();
        int ans = user1.remdays(days);

        System.out.println("Number of days left for 365 days of coding journey: " + ans);
        input.close();
    }
}