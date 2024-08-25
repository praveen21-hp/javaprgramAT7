package july.ex_27072024Arrays;

public class lab141 {
    public static void main(String[] args) {
        // Single-dimensional arrays
        //  have only one dimension, representing a list of elements.
        int[] ages = {90, 91, 93};
        int[] ages2 = new int[10];

        // Multi-dimensional arrays
        //  have two or more dimensions, representing a table or grid of elements.
        // AT - 2D, 3D - Coding Questions.
        int[] array_1d = {450, 50, 321};


        //  2D
        int[][] array_2d_1 = new int[3][3];  // variable name should be same for while using same variable obsercer below explam
        // |0|0|0|
        // |0|0|0|
        // |0|0|0|//r // c
        array_2d_1[0][0] = 34;
        // |34,0,0|
        // |0,0,0|
        // |0,0,0|
        array_2d_1[0][1] = 12;
        // |34,12,0|
        // |0,0,0|
        // |0,0,0|

        System.out.println(array_2d_1);
    }
}
