package ex_14072024;

public class lab64 {
    public static void main(String[] args) {
        String s1 = "New Job";  // Scp
        String s2 = "New Job";

        //System.out.println(s1==s2);
        //System.out.println(s1.equals(s2));
        String s3 = new String("New Job");  // heap area
        System.out.println(s1==s3); // check for ref
        System.out.println(s1.equals(s2)); // check for content


    }
}
