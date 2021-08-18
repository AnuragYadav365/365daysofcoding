package DAY01;

public class format_spec {
    public static void main(String[] args) {
        System.out.println("Displaying strings and different values using format specifiers: ");

        int aInt = 1;
        String aStr1 = "Initial Coder";
        String aStr2 = "365 Days of Code";

        System.out.printf("This is %s and today is day %d of %s", aStr1, aInt, aStr2);
        System.out.println("");
    }
}
