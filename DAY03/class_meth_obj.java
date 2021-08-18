package DAY03;
import java.util.Scanner;

//Defining Class
class Statement{

    String data;

    //Object Method
    void display(){
        System.out.println(data + " is awesome!");
    }
}

public class class_meth_obj {
    public static void main(String[] args) {
        
        // Declaration of object
        Statement S1 = new Statement();
        Scanner input = new Scanner(System.in);

        //Taking input from the user at runtime
        S1.data = input.nextLine();

        //Calling object method
        S1.display();
        input.close();
    }
}
