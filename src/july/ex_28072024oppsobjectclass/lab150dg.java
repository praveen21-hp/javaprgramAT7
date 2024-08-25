package july.ex_28072024oppsobjectclass;

public class lab150dg {
    public static void main(String[] args) {

        // functions - perform a task , block of code
        // functions within the class are called -> methods?
        // class -> blueprint
        // object ->  real entity created from the class. / instance of the class.


        // Data members, properties / Attributes
        Dog dog=new Dog();
        dog.name="labour";
        dog.bread="local";
        dog.size="lager";
        dog.colour="black";

        dog.buzz();

        Dog dog1 = new Dog();
        dog1.name="germay";
        dog1.bread="friednly";
        dog1.colour="white";
        dog1.size="medium";

        dog1.sleep();
        dog1.smell();


    }
}
