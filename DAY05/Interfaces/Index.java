package DAY05.Interfaces;

public class Index {
    public static void main(String[] args) {
        
        Information info_coll = new College("Stanford University");
        Information info_sch = new School("St. Petersburg");

        info_coll.display_info();
        info_sch.display_info();

    }

}
