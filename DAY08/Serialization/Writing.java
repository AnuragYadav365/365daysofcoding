package DAY08.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Writing {
    public static void main(String[] args) {
        
        //Creating instances of the class
        User_Class user1 = new User_Class(478, "Michael");
        User_Class user2 = new User_Class(786, "Lisa");
        User_Class user3 = new User_Class(041, "Martyn Ford");

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        //Writing the instances with serialization in .data file
        try (FileOutputStream fileOutput = new FileOutputStream("user.data")) 
        {
            ObjectOutputStream ObjOutput = new ObjectOutputStream(fileOutput);
            ObjOutput.writeObject(user1);
            ObjOutput.writeObject(user2);
            ObjOutput.writeObject(user3);

            ObjOutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
