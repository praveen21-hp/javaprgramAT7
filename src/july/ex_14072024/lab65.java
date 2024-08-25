package july.ex_14072024;

import java.sql.SQLOutput;

public class lab65 {
    public static void main(String[] args) {
        String s1= new String("MYLife");
        String s2 = new String("MYLife");
        String s3 =new String ("MYlife");

        System.out.println(s1==s2); //check for ref
        System.out.println(s1.equals(s2)); // content
    }
}
