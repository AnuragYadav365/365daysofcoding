package DAY06.Abstract_class;

public abstract class Network {

    String ip;

    public void getip(String ip){
        this.ip = ip;
    }

    public void display_ip(){
        System.out.println(ip);
    }

    //Abstract method
    public abstract void msg(); //This method must be defined in the connected sub classes
}
