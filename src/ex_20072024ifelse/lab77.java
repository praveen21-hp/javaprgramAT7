package ex_20072024ifelse;

import java.util.Scanner;

public class lab77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        int user1 = sc.nextInt();

        System.out.println("Enter number2");
        int user2 = sc.nextInt();
       // System.out.println(Math.max(user1,user2));

        if(user1>user2)
        {
            System.out.println("user1");
        } else
        {
            System.out.println("user2");
        }

    }
}
