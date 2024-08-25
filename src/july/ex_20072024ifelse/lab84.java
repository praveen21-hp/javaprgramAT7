package july.ex_20072024ifelse;

import java.util.Scanner;

public class lab84 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Will day only Vowel when you enters character");
        char user_input = sc.next().charAt(0);


        switch (user_input)
        {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("vowel");
                break;
            case 'i':
                System.out.println("vowel");
                break;
            case '0':
                System.out.println("vowel");
                break;
            case 'u':
                System.out.println("vowle");
                break;

            default:
                System.out.println("out of the content");




        }
    }
}
