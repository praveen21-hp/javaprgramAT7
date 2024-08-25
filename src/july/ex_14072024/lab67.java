package july.ex_14072024;

public class lab67 {
    public static void main(String[] args) {
        String s1= "Pr@veen";
        String s2= s1.toLowerCase();
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.substring(0,4));
        System.out.println(s1.indexOf('n'));
        System.out.println(s1.length());
    }
}
