package ex_20072024ifelse;

import java.util.Scanner;

public class lab86 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Find the vowel by entering ");
        char user_input = sc.next().charAt(0);

        switch (user_input)
        {
            case 'a','e','i','o','u':
                System.out.println("this vowle character");
                break;

            default:
                    System.out.println("none of the above");
        }

    }
}
