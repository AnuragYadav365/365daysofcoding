package DAY01;

public class while_loop {
    public static void main(String[] args) {
        int aVal = 5;
        int aDig = 1;
        System.out.println("The mathematical table for number 5 is: ");
        while(aDig < 11)
        {
            System.out.println(aVal * aDig);
            aDig = aDig + 1;
        }
    System.out.println("We have succesfully ouput the table of 5");
    }
}
