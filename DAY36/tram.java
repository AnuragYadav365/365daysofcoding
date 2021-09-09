package DAY36;
import java.util.*;
public class tram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int person = 0;
        int max = 0;
        for(int i=0; i<n; i++){
            int exit = scan.nextInt();
            int enter = scan.nextInt();
            person = (person - exit) + enter;

            if(person > max){
                max = person;
            }
        }
        scan.close();
        System.out.println(max);
    }
}
