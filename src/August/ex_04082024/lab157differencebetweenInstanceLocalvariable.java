package August.ex_04082024;

public class lab157differencebetweenInstanceLocalvariable {

    int a =50;// Instance variable

    void f(){
        int a=30; /// Local variable
        System.out.println(a);
    }

    void f2(){
        System.out.println(a);
    }
}
