public class Seigenfunction{
     public static void main(String[] args) {
         System.out.println("This class is to calculate sinx");

         System.out.println(sin(0.0));
         System.out.println(sin(Math.PI/2));
         System.out.println(sin(Math.PI));

    }

    public static double sin(Double theta){
        return Math.sin(Math.toRadians(theta));
        }
}