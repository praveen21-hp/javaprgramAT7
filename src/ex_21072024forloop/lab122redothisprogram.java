package ex_21072024forloop;

public class lab122redothisprogram {
    public static void main(String[] args) {
        // Functions
        // Block of code which we can reuse.
        // 1. Pre-built - Math.max()
        // 2. User created / defined

        // Two component of the functions
        // 1. Define
        // 2. Call the function

        //  1. function Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type
function_type1();

        System.out.println("----------------------"); // this because we can which type 1 is executing in console

String name =function_type2();  // we have use date type
        {
            System.out.println(name);
        }
        System.out.println("----------------------"); // this because we can which type 1 is executing in console

        function_type3("praveen");
        function_type3("piddannavar");
        System.out.println("----------------------");

//        String Company=function_type4("Google");
//        System.out.println(Company);

        int sum =function_type4(4,8);
        System.out.println("O/P"+sum);

    }
    //  1. function Without Parameters and Without Return Type
   static void function_type1()
    {
        System.out.println("1 function Without Parameters and Without Return Type");
    }
    // 2.Without Parameters but With Return Type
     static  String function_type2()
     {
         System.out.println("2.Without Parameters but With Return Type");
         return "praveen";  // when we have return type can store the value
     }
    // 3.With Parameters and Without Return Type
     static void function_type3(String name){   //  we can use integer by changing date type
         System.out.println("  // 3.With Parameters and Without Return Type");
         System.out.println("You have share -->"+name);
     }
    // 4. With Parameters and With Return Type
//    static String function_type4(String name){
//        System.out.println("// 4. With Parameters and With Return Type");
//        return "Working in MNC company";

    static int function_type4(int a,int b){
        return a+b;


    }

}
