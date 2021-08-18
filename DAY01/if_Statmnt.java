package DAY01;

public class if_Statmnt {
    public static void main(String[] args) {
        // boolean val = 2 != 4;
        int aDay = 0;
        while(true)
        {
            if(aDay == 365) //if statement
            {
                System.out.println("You have completed 365 Days of coding journey! Hurray!");
                break;
            }
            System.out.println("Reached Day: " + aDay);
            aDay++;
        } 
    }
    
}
