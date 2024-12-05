package August.ex_04082024;

public class BankAccount {

    // Instance variable
    String bankname;
    int balance;
    String bankcode;


    //DC

    BankAccount(){
        bankname="sbi";
        balance=900;
        bankcode="sbin0005166";

    }

    // pc
    BankAccount(String name,int bal,String bcode){
        this.bankname=name;
        this.balance=bal;
        this.bankcode=bcode;

    }
    void printdetails(){
        System.out.println("Bank Name-->" +bankname );
        System.out.println("Bank Code-->" +bankcode);
        System.out.println("bal -->"+ balance);
    }

}
