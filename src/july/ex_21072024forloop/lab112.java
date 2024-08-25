package july.ex_21072024forloop;

public class lab112 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i = i + 2) {
            if (i % 5 == 2) {
                System.out.println("konw"+i);
                continue;
            }
            System.out.println("unkonw"+i);
        }
    }
}