package August.ex_04082024.singleheritance.real;

public class testcase2 extends basetest{

    void testcase2(){
        startbrowser();
        // here we will  write the Tc
        getDataFromsql();
        closebrowser();
        System.out.println(gold);
    }

    public static void main(String[] args) {
        new testcase2().testcase2();
    }


}
