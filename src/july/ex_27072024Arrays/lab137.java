package july.ex_27072024Arrays;

import java.util.Scanner;

public class lab137 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] mark = new float[6];
        System.out.println("Enter the mark of the sub1");
        mark[0] = sc.nextFloat();
        System.out.println("Enter the mark of the sub2");
        mark[1] = sc.nextFloat();
        System.out.println("Enter the mark of the sub3");
        mark[2] = sc.nextFloat();
        System.out.println("Enter the mark of the sub4");
        mark[3] = sc.nextFloat();
        System.out.println("Enter the mark of the sub5");
        mark[4] = sc.nextFloat();
        System.out.println("Enter the mark of the sub6");
        mark[5] =sc.nextFloat();

        float avg= (mark[0]+mark[1]+mark[2]+mark[3]+mark[4]+mark[5]) /6;
        System.out.println("Avg of mark is"+avg);

    }
}
