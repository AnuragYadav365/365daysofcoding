package DAY06;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileNotFoundException;

public class Mult_except {
    public static void main(String[] args) {

        System.out.println("Enter the filename(must be string): ");
        Scanner input = new Scanner(System.in);
  
        try {
            String fileName = input.nextLine();
            File file1 = new File(fileName);
            Scanner text = new Scanner(file1); //error arises here
            while(text.hasNextLine()){
                String line = text.nextLine();
                System.out.println(line);
            }

            System.out.println("\nSuccessfully Accessed the file!");

            text.close();
        } 
        
        catch (InputMismatchException exc) {
            System.out.println("You have not entered a string value");
        }

        
        catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        }

        //File Not found exception is caught only because even if user enter an int value it will act as a string in the teminal!

        input.close();
    }
}

