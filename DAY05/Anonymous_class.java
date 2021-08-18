package DAY05;

class Mobile{
    public void msg(){
        System.out.println("Message received!");
    }

}

public class Anonymous_class {
    public static void main(String[] args) {
        
        //creating instance of Mobile class
        Mobile mob1 = new Mobile() {
            
            //anonymous class
            public void msg(){
                System.out.println("Call received");
            }
        };
        mob1.msg();
    }
}
