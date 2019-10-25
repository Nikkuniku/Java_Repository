import java.util.ArrayList;
import java.util.List;

public class Fibonacci{
    //default value
    static int a_0=0;
    static int a_1=1;
    static int a_2=a_0+a_1;

    public static void main(String[] args) {
        int k=Integer.valueOf(args[0]);

        for (int j=0;j<k;j++){
            System.out.println(fib(j));
        }
    }

    public static int fib(int n){
        int a_n;
        List<Integer> array = new ArrayList<Integer>();

        if(n==0){
            return a_n=a_0;
        }else if(n==1){
            return a_n=a_1;
        }
        else{
            array.add(a_0);
            array.add(a_1);
            for (int i=1;i<n;i++){
                a_n=array.get(i-1)+array.get(i);
                array.add(a_n);
            }
            return array.get(n);
        }

    }
}