//https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

package DAY19;
import java.util.Scanner;
import java.util.regex.*;

public class Pattern_Syntax_Regex
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
            testCases--;
          	//Write your code
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
		}
        in.close();	
	}
}
