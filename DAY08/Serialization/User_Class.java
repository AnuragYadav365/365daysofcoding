package DAY08.Serialization;

import java.io.Serializable;

public class User_Class implements Serializable{
    
    String user_name;
    int user_id;

    User_Class(int id, String name){
        this.user_name = name;
        this.user_id = id;
    }

    @Override
    public String toString(){
        return "Your user id is " + user_id + " and name is " + user_name;
    }
}
