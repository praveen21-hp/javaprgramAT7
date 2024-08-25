package ex_27072024Arrays;

public class lab139interautomationdomoreexlpam {
    public static void main(String[] args) {
        // Find the Max in the Arrays
        // Find the Max Salary, Min  in the Salary Array
        int[] salaries ={ 4,5,30,34,2,45};
        int max= 1;  /// COMPARE with salaries
        for(int i =0; i<salaries.length;i++){
            if(salaries[i]>max){
                max=salaries[i];
            }
        }
        System.out.println(max);
       // System.out.println(min);
    }
}
