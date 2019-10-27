public class derivation{
    public static void main(String[] args) {
        System.out.println("微分係数は"+ax2_dydx(3,3)+"です。");
        }

    //関数y=ax^2の点xでの微分係数を返す。
    public static double ax2_dydx(int a,double x){
        //微小増加分
        double h=0.1;
        //閾値（しきい値）
        double alpha =0.02;
        //ステップ幅
        double eta =0.02;
        //極限を取る前の微分係数
        double der=(a*Math.pow((x+h),2)-a*Math.pow(x,2))/h;

        while(true){
            if(h<alpha){
                break;
            }
            h-=eta;
        }
        return Math.round(der);

    }    
}