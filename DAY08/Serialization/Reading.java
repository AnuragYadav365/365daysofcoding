package DAY08.Serialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reading {
    public static void main(String[] args) {
        
        try (FileInputStream file = new FileInputStream("user.data")) {

            ObjectInputStream ObjInput = new ObjectInputStream(file);
            
            User_Class user1 = (User_Class) ObjInput.readObject();
            User_Class user2 = (User_Class) ObjInput.readObject();
            User_Class user3 = (User_Class) ObjInput.readObject();

            ObjInput.close();
            System.out.println(user1);
            System.out.println(user2);
            System.out.println(user3);
            
        } catch (EOFException e) {
            System.out.println("Invalid Objects");
        } catch (IOException e) {
            System.out.println("File Reading Error");
        } catch (ClassNotFoundException e) {
            System.out.println("Class Not Found");
        }

    }
}
