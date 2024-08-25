package july.ex_27072024Arrays;

public class lab142 {
    public static void main(String[] args) {
        int array_2d[][] = {
                {20, 39, 34},
                {32, 33, 34},
                {20, 35, 12}
        };
        for (int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[i].length; j++) {
                System.out.print(array_2d[i][j]);
                System.out.print("\t");

            }
            System.out.println(" ");
        }
    }
}

