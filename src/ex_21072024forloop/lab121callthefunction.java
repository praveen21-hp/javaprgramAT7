package ex_21072024forloop;

public class lab121callthefunction {
    public static void main(String[] args) {
        // two component of the function
        // 1] define
        // 2] call the function
        for (int i = 0; i < 5; i++) {
            sam();  // calling the function
        }
        sam2();

    } // define the function

    static void sam() {
        System.out.println("hello");

    }

    static void sam2() {
        System.out.println("hello new boy");
    }
}
