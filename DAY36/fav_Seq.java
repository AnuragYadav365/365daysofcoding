//https://codeforces.com/problemset/problem/1462/A
//Anurag Yadav
//https://github.com/AnuragYadav365

//package DAY36;
import java.util.*;

public class fav_Seq{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        for(int k=0; k<t; k++){
            List<Integer> L= new ArrayList<Integer>();
            int n = scan.nextInt();
            for(int i =0; i<n; i++){
                L.add(scan.nextInt());
            }
            List<Integer> L2= new ArrayList<Integer>();

            int lastindex = 0;
            int start = 0;
            int end = 0;
            for(int j=0; j<((n%2==0)?n/2:(n+1)/2); j++){
                start = L.get(j);
                lastindex = n-(j+1);
                end = L.get(lastindex);
                //System.out.println("J is "+ j);
                //System.out.println(start + " lastindex " + lastindex + " end " + end);

                //inserting into the list L2
                L2.add(start);
                L2.add(end);
            }
            if(L.size()%2!=0){
                L2.remove(n-1);
            }
            L2.forEach((e) -> System.out.print(e + " "));
            System.out.println();
        }
        scan.close();
    }
}