package August.ex_04082024;

import java.util.Scanner;

public class lab160bank {
    public static void main(String[] args) {

        //this is using Default constructor
        BankAccount b = new BankAccount();
        /*System.out.println(b.bankname);
        System.out.println(b.bankcode);
        System.out.println(b.balance);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your bank name");
        String bname = sc.next();
        System.out.println("Enter your balance");
        int bal = sc.nextInt();
        System.out.println("Enter your code");
        String code= sc.next();

        sc.close();




        // this is using parameter constructor
       // BankAccount new1 = new BankAccount(bname,bal,code);
        BankAccount new1 = new BankAccount(bname,bal,code);
        /*System.out.println(new1.bankname);
        System.out.println(new1.balance);
        System.out.println(new1.bankcode);*/

        /*b.printdetails();
        new1.printdetails();*/

        new1.printdetails();
    }
}
