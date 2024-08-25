package july.ex_27072024Arrays;

import java.util.Scanner;

public class lab138 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] mark = new float[5];
        for(int i=0; i<mark.length; i++) {

            System.out.println("Enter the mark of the sub" + (i + 1));
            mark[i] = sc.nextFloat();
        }

        float avg= (mark[0]+mark[1]+mark[2]+mark[3]+mark[4]) /5;
            System.out.println("Avg of mark is"+avg);
/// we can use while loop as well
            int j=0;
            while(j<mark.length){
                System.out.println(mark[j]);
                j++;
            }


    }
}
