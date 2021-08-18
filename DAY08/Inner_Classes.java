package DAY08;

import DAY08.Empl.Manager;

class Empl{
    String user;
    public static String comp = "Tim's Foundation";

    Empl(String user){
        this.user = user;
    }

    //NON-Static Inner Class
    class Manager{
        void main_msg(){
            System.out.println("This is the main msg by manager to employee: ");
            System.out.println(user);
        }
    }

    //Static Inner Class(can only access static data)
    static class Company{
        void comp_name(){
            System.out.println("Your company is: " + comp); //here comp is static variable
        }
    }

    void welcome(){
        System.out.println("------------------------------------------");
        System.out.println("Welcome to the Comany to all employees");

        Empl emp = new Empl("Robert");
        emp.welcome();
        //Methods having inner classes
        class Block{
            void block_info(){
                System.out.println("Hi! " + user + " Your block is 55");
            }
        }

        //Accessing class inside another class's method
        Block block = new Block();
        block.block_info();
    }

}


public class Inner_Classes {
    public static void main(String[] args) {
        
        Empl emp1 = new Empl("Robert");
        emp1.welcome();
        //Accessing inner class via superclass class instance(empl)
        Manager user1 = emp1.new Manager();
        user1.main_msg();

        //Accessing Static Inner Class
        Empl.Company comp1 = new Empl.Company();
        comp1.comp_name();
    }
}
