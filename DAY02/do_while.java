package DAY02;
import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        
        int aDay = 0;
        Scanner data = new Scanner(System.in);
        System.out.println("TOday is which day of 365 days of coding journey.");
        do{
            System.out.println("Enter the day!");
            aDay = data.nextInt();
            
        }
        while(aDay != 2); //Because today is day 2 of 365 days of code
        System.out.printf("YES! Today is DAY %d of the journey!", aDay);
        data.close();
    }
}
