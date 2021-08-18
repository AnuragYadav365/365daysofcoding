package DAY02;

public class array_Def {
    public static void main(String[] args) {
        
        //To create array object
        int[] number = new int[3];
        number[0] = 50;
        number[1] = 60;
        number[2] = 70;

        System.out.println("Number stored in the array are: ");
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);

        // Initializing an array
        int[] number2 = {10, 20, 30, 40};

        System.out.println("Number stored in the second array: ");
        
        //iterating through the array via for loop
        for (int j = 0; j < 4; j++)
        {
            System.out.println(number2[j]);
        }
    }
}
