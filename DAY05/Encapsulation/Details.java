package DAY05.Encapsulation;

public class Details {
    public String user;
    //Constructor called
    public Details(){
        System.out.println("Details of the user");
    }

    
    
    private int Passw = 123456;

    public void pass(){
        System.out.println("Directly showing the password from own class");
        System.out.println(Passw);
    }

}
