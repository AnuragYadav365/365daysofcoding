package DAY04;

class Display{

    String str;

    //Constructor Called
    public Display(){
        this("DAY 4 is very hectic day for me!");
        //Output the value of the str for this class
        System.out.println(str);
    }

    //Parameterized Constructor
    public Display(String str){
        //Changing the str value of the class equal to the passed String
        this.str = str;
        System.out.println("Second constructor");
    }

    void disp_Str(){
        //Printing out the final value of str
        System.out.println(str);
    }
}
public class constructor {
    public static void main(String[] args) {
        
        //instance of class
        new Display();
        Display d1 = new Display();
        //calling disp_Str method  from Display class
        d1.disp_Str();

    }
}
