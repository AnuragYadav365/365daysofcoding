package DAY12;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class End_of_file{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Anurag Yadav\\Desktop\\365 days of code\\DAY12\\file_for_input.txt");
        Scanner text = new Scanner(file);

        int count = 1;
        while(text.hasNextLine()){
            String line = text.nextLine();
            System.out.printf("%d %s", count, line);
            System.out.println();
            count++;
        }
        text.close();


    }
}