package july.ex_14072024;

public class lab55 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);
        // A--> ++a, EXP=11  | a=11
        // +
        // B--> ++a, EXP= 12 | a= 12
    }
}
