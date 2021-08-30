package DAY24.dtcc_code_A_thon;

import java.util.Scanner;

class Result{
    public static int getMin(String s) {
        int bal = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) == '('){
                bal += 1;
            }
            else{
                bal += -1;
            }

            if (bal == -1){
                ans += 1;
                bal += 1;
            }
        }
        return bal + ans;
    }
}

public class BALANCE_parenthesis{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        inp.close();
        int ans = Result.getMin(s);
        System.out.println(ans);
    }
}