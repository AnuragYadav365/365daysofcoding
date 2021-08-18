package DAY07.Inner_Classes;

public class Incl_class {
    
    String item;

    //Constructor
    public Incl_class(){
        item = "Mobile";
    }

    void disp_item(){
        System.out.println("Item Purchased is: " + item);
    }

    //Non-Static Class
    class Price{
        public int amnt;
        Incl_class C1 = new Incl_class();

        Price(int amnt){
            this.amnt = amnt;
        }

        void disp_amnt(){
            System.out.println("Amount of the item " + item + " is " + amnt);
        }
    }
}
