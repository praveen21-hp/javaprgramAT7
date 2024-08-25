package july.ex_20072024ifelse;

import java.util.Scanner;

public class lab76scaner {
    public static void main(String[] args) {
//Take user input and check if number id even or odd



        //Logic Building - Ready
        //1. Figure out the inputs & // 2. Data type
        //Data type - . int
        //How to take input in the Java? - Scanner - class -
        //nextInt() -> input

        //3. Do we need conversion or directly
        //4. Rough logic - num%2==0 even, odd
        //5. optimize
        //int - size - 32bit -> range (2,147,483,647)
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter the number");
        int user_input = sr.nextInt();
        System.out.println(user_input);

        if(user_input%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("odd number");
        }


    }

}
