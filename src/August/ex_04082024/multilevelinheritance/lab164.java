package August.ex_04082024.multilevelinheritance;

public class lab164 {
    public static void main(String[] args) {
        // multi level
        // gf-->f--->child
        child c = new child(); // if name is same C--F---GF
        c.home();
        c.c();
        c.gf();
        c.f();
    }
}
