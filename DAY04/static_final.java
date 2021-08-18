package DAY04;

class Program{
    //Constant declaration
    public static final String MISSION = "365 DAYS OF CODE";

    public String user;
    public static String work = "Information of users";

    public void disp_user(){
        System.out.println("User name " + user);
    }

    public void disp_Work(){
        System.out.println(user + " is working on " + work); //making use of static variable
    }

    //Static method which can only access a static variable
    public static void info(){
        System.out.println(work); //work is a static variable here
    }


}
public class static_final {
    public static void main(String[] args) {
       
        Program user1 = new Program();
        Program user2 = new Program();

        user1.user = "Initial Coder";
        user2.user = "Anurag Yadav";

        //calling static method
        Program.info(); //class used directly with static methods and variables

        //Output the constant value
        System.out.println(Program.MISSION);

        //displaying user name
        user1.disp_user();
        user2.disp_user();

        user1.disp_Work();
        user2.disp_Work();

    }
}
