package ex_27072024Arrays;

public class lab143 {
    public static void main(String[] args) {
        int[][] array_2d_1={
                {1,2},
                {3,4},
                {5,6}
        };
        for( int i =0; i<array_2d_1.length; i++){
            for( int j =0; j<array_2d_1[i].length; j++){
                System.out.print(array_2d_1[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
