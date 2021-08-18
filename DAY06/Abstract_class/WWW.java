package DAY06.Abstract_class;

public class WWW {
    public static void main(String[] args) {
        
        /*Network class is the base class here
        so instances for subclasses can be created
        using netwrok class */

        Network appliance1 = new Computer();
        appliance1.getip("174589:5478:21:1");

        Router appliance2 = new Router();
        appliance2.getip("5478:95:2");

        //Cannot instantiate abstract class like this
        //Network n1 = new Network();

        appliance1.display_ip();
        appliance2.display_ip();

        appliance1.msg();
    }
}
