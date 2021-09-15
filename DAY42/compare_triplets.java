import java.util.*;
public class compare_triplets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        List<Integer> final_lst = new ArrayList<Integer>();
        final_lst.add(0);
        final_lst.add(0);
        for(int i=0; i<3; i++){
            int aval = scan.nextInt();
            a.add(aval);
        }

        for(int i=0; i<3; i++){
            int bval = scan.nextInt();
            b.add(bval);
        }

        int ascore = 0;
        int bscore = 0;
        for(int m=0; m<3; m++){
            if(a.get(m) > b.get(m)){
                ascore+=1;
            }
            else if(a.get(m) < b.get(m)){
                bscore+=1;
            }
        }
        System.out.println(final_lst);
    }
}
