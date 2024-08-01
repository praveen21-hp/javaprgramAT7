package ex_14072024;

public class lab50 {
    public static void main(String[] args) {
        int mobile =150;
        float tab=200.87f;
        float total_cost = mobile+tab; // implicit narrowing
        System.out.println(total_cost); // Explicit narrowing
    }
}
