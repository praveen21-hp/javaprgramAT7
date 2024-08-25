package ex_27072024Arrays;

public class lab145 {
    public static void main(String[] args) {
        String s2= new String("praveen");
        s2="hp";
        StringBuffer stringBuffer = new StringBuffer("praveem");
        stringBuffer.append("kumar");
        stringBuffer.append("piddannavar");

        StringBuilder stringBuilder = new StringBuilder("keerti");
        stringBuilder.append("hp");
        // Thead Safty?

        // stringBuilder - not thread safe - people LOVE it :)

    }
}
