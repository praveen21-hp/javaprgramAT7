package july.ex_27072024Arrays;

public class lab140domorepartice {
    // Do practice lab 139
    // lab 147 re watch once // yet start with 148 ex timer 1:10.20
    public static void main(String[] args) {
        int[] sub={3,7,-1,19,2,-9};
        int min=sub[0];
        for(int i=0; i<sub.length;i++ )
        {
            if(min>sub[i])
            {
                min=sub[i];
            }
        }
        System.out.println(min);
    }

}
