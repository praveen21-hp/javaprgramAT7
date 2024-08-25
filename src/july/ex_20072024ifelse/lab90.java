package july.ex_20072024ifelse;

public class lab90 {
    public static void main(String[] args) {
        char code = 'A';
        int val = switch (code){
            case 'A':
                yield 65;

            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);

    }
}
