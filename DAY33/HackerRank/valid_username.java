package DAY33.HackerRank;
import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */

    public static final String regularExpression = "(\\w*{8,30})[^_][a-zA-z]{1}\\w*{8,30}";
}
public class valid_username {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}