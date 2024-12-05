package August.ex_04082024;

public class ATBperson {
    String name;
    long phone;

    // dc

    public ATBperson() {
        System.out.println("object is created ");
    }
    // parameter constructor
    ATBperson(String nameGiven  ){
        this.name=nameGiven; // this current class

    }
    ATBperson(String namegiven,long phone){
        this.name=namegiven;
        this.phone=phone;
    }
}
