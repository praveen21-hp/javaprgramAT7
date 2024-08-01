package ex_14072024;

public class lab56 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        // A--> exp a=21 | a=21
        // +
        // B--> exp b=21 | a=22
        //+
        // c--> exp c= 22 | a=23

    }
}
