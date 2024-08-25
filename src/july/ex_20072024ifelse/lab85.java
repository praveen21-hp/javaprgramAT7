package july.ex_20072024ifelse;

public class lab85
{
    public static void main(String[] args) {
         // checking multiple case handle in switch line

        int num = 001;
                switch(num){
                    case 002,003,004:
                        System.out.println("digital market"); break;
                    case 005,006,007:
                        System.out.println("stock exchange"); break;

                    default:
                        System.out.println("none of the above");
                }


    }
}
