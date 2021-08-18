package DAY05.Polymorphism;

public class Student extends Teacher{
    
    String name = "Josh Champ";
    
    @Override
    public void display(){
        System.out.println("Student Name: ");
        System.out.println(name);
    }
}
