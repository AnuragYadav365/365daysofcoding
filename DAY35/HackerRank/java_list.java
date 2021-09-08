package DAY35.HackerRank;
import java.util.*;

public class java_list {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        List<Integer> L= new ArrayList<Integer>();
        for(int i = 0; i<N; i++){
            L.add(scan.nextInt());
        }

        String cmd;
        int Q = scan.nextInt();
        for(int j=0; j<Q; j++){
            scan.nextLine();
            cmd = scan.nextLine();

            if(cmd.equalsIgnoreCase("insert")){
                int index = scan.nextInt();
                int element = scan.nextInt();

                L.add(index, element);
            }
            else if(cmd.equalsIgnoreCase("delete")){
                int index = scan.nextInt();
                L.remove(index);
            }
        }
        scan.close();

        for(int k=0; k<L.size(); k++){
            System.out.print(L.get(k) + " ");
        }
    }
}
