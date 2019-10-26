public class Judgementprimenumber{
    public static void main(String[] args) {
        int k=Integer.valueOf(args[0]);
        if(Judgeprime(k)){
            System.out.println(k+" is Prime Number.");
        }else{
            System.out.println(k+" isn't Prime Number.");
        }
    }

    private static boolean Judgeprime(int n){
        int i =2;
        boolean result;
        while(true){
            if(i==n){
                result= true;
                break;
            }
            if(n%i==0){
                result= false;
                break;
            }
            i++;
        }
        return result;
        }
    }