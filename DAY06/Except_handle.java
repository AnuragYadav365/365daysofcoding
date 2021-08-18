package DAY06;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Except_handle {
    public static void main(String[] args) {
        
        //retreiveing the file
        File file1 = new File("C:\\Users\\Anurag Yadav\\Desktop\\365 days of code\\DAY6\\DAY6.txt");

        //trying to read the file
        try{
            Scanner text = new Scanner(file1);
            System.out.println("Succesfully retrieved the file!");

            //output the data from the file
            while(text.hasNextLine()){
                String line = text.nextLine();
                System.out.println(line);
            }

            text.close();
        }

        //if file Not found in the directory
        catch(FileNotFoundException exc){
            System.out.println("File Not Found!");
        }
    }
}
