package DAY05.Interfaces;

public class College implements Information{
    
    public String name;

    public College(String name){
        System.out.println("College registered!");
        this.name = name;
    }

    public void display_info(){
        System.out.println("Information about College: " + name);
    }


}
