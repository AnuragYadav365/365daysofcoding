package DAY05.Encapsulation;

public class display extends Details{
    
    public display(String user){
        this.user = user; //assigning the value of passed argument to user varaible of details class
    }

    public void disp_user(){
        System.out.println(user);
    }

    public void disp_pass(){
        System.out.println("Password is not visible as it is private");
        //System.out.println(Passw);
    }
}
