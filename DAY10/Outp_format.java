package DAY10;
import java.util.Scanner;

public class Outp_format{

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                int wspacecount = 15 - s1.length();

                int zerocount = 3 - String.valueOf(x).length();
                System.out.printf("%s%s%s%d", s1, " ".repeat(wspacecount), "0".repeat(zerocount), x);
                System.out.println();
            }
            sc.close();
            System.out.println("================================");

    }
}
