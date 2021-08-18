package DAY05.Encapsulation;

public class Info {
    
    public static void main(String[] args) {
        
        display u1 = new display("Initital Coder");
        u1.disp_user();
        //here in disp_pass() pass is private so it can't display pass value
        u1.disp_pass();

        //since pass is public function show it can display the pass value
        u1.pass();
    }
}
