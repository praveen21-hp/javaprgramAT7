package july.ex_14072024;

public class lab49 {
    public static void main(String[] args) {
        int bike= 200;
        double car =300.95;
        //int total = bike+car;   // implicit narrowing
        int total = bike+(int)car;   // Explicit narrowing
        System.out.println(total);


    }
}
