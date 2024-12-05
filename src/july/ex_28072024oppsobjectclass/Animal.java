package july.ex_28072024oppsobjectclass;

public class Animal {
    String name = "Tiger";
    String colour;

    void walk(){}
    void  eat(){}

    public static void main(String[] args) {
        Animal ani =  null;
        Animal ani2 = new Animal();
        Animal ani3 = new Animal();
        Animal ani4 =ani2;
        System.out.println(ani3.name);

    }

}
