package ex_27072024Arrays;

import java.util.Scanner;

public class lab125 {
    public static void main(String[] args) {
         int scorce []= new int[4];
         // index start from 0,1,2,3
        // length 4
        System.out.println(scorce[0]);
        System.out.println(scorce[1]);
        System.out.println(scorce[2]);
        Scanner sc= new Scanner(System.in);
        scorce[0]=sc.nextInt();
        scorce[1]=90;
        scorce[2]=95;
        System.out.println(scorce[0]);
        System.out.println(scorce[1]);
        System.out.println(scorce[2]);
       // System.out.println(scorce[7]);

        boolean[] is_married ={true,false,true};
         for(int i=0; i<scorce.length;i++) {
             System.out.println(i+"----> "+ scorce[i]);
            // System.out.println(scorce[i]);
         }

            String weekEnd[]={"monday","tue","web","sunday"};
            for (int i = 0; i < weekEnd.length; i++)
            {
                System.out.println(weekEnd[i]);
            }
// in array if we use <= greater than or equal to will get error hence do dnt use
        // when ever we start with array it will start form zero 0


    }
}
