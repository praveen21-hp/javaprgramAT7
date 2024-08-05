package ex_20072024ifelse;

import java.util.Scanner;

public class lab91 {
    public static void main(String[] args) {
        // wirte a program with user input by asking name place salary age

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter your place");
        String place = sc.next();

        System.out.println("Enter your salary");
        double salary = sc.nextDouble();

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("your details are "+" "+ name);
        System.out.println("your place is "+" "+ place);
        System.out.println("your salary is"+" "+ salary);
        System.out.println("your age is"+" "+age);

        sc.close();
    }
}
