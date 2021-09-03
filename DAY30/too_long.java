//package DAY30;

import java.util.Scanner;
public class too_long {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String emp = sc.nextLine();
        for(int i=0; i<n; i++){
            String s = sc.nextLine();
            if(s.length() <= 10){
                System.out.println(s);
            }
            else{
                String start = s.substring(0,1);
                String end = s.substring(s.length() - 1);

                int count = 0;
                for(int j = 1; j<=(s.length()-2); j++){
                    count++;
                }
                System.out.println(start + count + end);
            }
        }

    }
}
