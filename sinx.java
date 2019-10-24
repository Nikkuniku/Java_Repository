public class sinx{
     public static void main(String[] args) {
         System.out.println("This class is to calculate sinx");
        sin(30.0);

        sin (60.0);

        sin(90.0);

    }

    public static void sin(Double theta){
        System.out.println("sin("+theta+") is "+Math.sin(Math.toRadians(theta)));
    }
}