package DAY05.Interfaces;

public class School implements Information{
    
    public String name;

    public School(String name){
        System.out.println("School registered!");
        this.name = name;
    }

    public void display_info(){
        System.out.println("Information about School: " + name);
    }

}
