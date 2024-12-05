package july.ex_28072024oppsobjectclass;

public class lab149bp {
    public static void main(String[] args) {

        //  Class - Attribute / properties - data Types - primitve or non primitive.
        // Class - Behaviour /Methods - functions -

        // object - real entity - class -
        // Syntax:  ClassName classRef = new ClassName();

        // new ClassName(); - Object
        // classRef - Class Ref
        // ClassName = Class Name which blueprint you are using


        Bulidingbp dlf =new Bulidingbp();
        dlf.name="new house";
        dlf.Address="shakti nagar dharwad";
        dlf.noofroom=4;
        dlf.colour="Green";
        dlf.uselift();

        Bulidingbp new2 =new Bulidingbp();
        new2.name="apartement";
        new2.Address="Horomavu";
        new2.noofroom=8;
        new2.colour="pink";
        new2.activities();

    }
}
