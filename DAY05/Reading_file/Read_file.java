package DAY05.Reading_file;

//importing file library
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_file {
    public static void main(String[] args) throws FileNotFoundException{

        File file1 = new File("C:\\Users\\Anurag Yadav\\Desktop\\365 days of code\\DAY5\\Reading_file\\file.txt");

        Scanner text = new Scanner(file1);

        int Days = text.nextInt();
        System.out.println("Total Days are: " + Days);

        while(text.hasNextLine()){
            String line = text.nextLine();

            //Displaying each line separately
            System.out.println(line);
        }

        text.close();
    }
    
}
