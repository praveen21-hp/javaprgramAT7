package july.ex_27072024Arrays;

import java.util.Scanner;

public class lab126imp {
    public static void main(String[] args) {
        int dog[]=new int[3];
        //index start from 0 --->>0,1,2,3
        // length
        System.out.println(dog[0]);
        System.out.println(dog[1]);
        System.out.println(dog[2]);
        Scanner sc = new Scanner(System.in);  // now taking user input in console
        System.out.println("Enter the dog no");
        dog[0]=sc.nextInt();
        dog[1]=4;
        dog[2]=5;
        System.out.println(dog[0]);
        System.out.println(dog[1]);
        System.out.println(dog[2]);

        for(int i=0; i<dog.length;i++)
        {
            System.out.println(i+"--->"+dog[i]);
        }

    }
}
