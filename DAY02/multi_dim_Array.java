package DAY02;

public class multi_dim_Array {
    public static void main(String[] args) {
        
        int[][] arr = {{1,2,3},{4,5,6},{6,7,8,9}};

        System.out.println(arr[1][2]); //Should print 6
        double[][] arr2 = new double[4][3]; //must specify the rows and columns

        System.out.println(arr2[1][2]); //should print default double value i.e. 0.0

        //iterating thorugh multi dimensional array
        System.out.println("The array stored is: ");
        for (int row = 0; row<arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            {
                System.out.print(arr[row][col] + "\t"); //\t is for tabular space
            }
            System.out.println();
        }
    }
}
