package Homework;
import java.util.Scanner;
public class Homework01 {
    public static void main(String[] args){
        zhu();
       while (true){
           Scanner kh=new Scanner(System.in);
           int xx=kh.nextInt();
           if (xx==1){
               System.out.println("你要求的园的半径为：");
               Yx(kh.nextInt());
               zhu();
           }
           else if (xx==2){
               System.out.println("你要求的矩形的面积的长和宽为：");
               Jx(kh.nextByte(),kh.nextByte());
               zhu();
           }
           else if (xx==3){
               System.out.println("你要求的三角形的面积的三条边为：");
               Sjx(kh.nextInt(),kh.nextByte(),kh.nextByte());
               zhu();
           }
           else if (xx==4){
               break;
           }
           else
               System.out.println("没有该选项 请再输入");
       }
        System.out.println("谢谢使用 下次再见");
    }
    public static void Yx(double x){
        double r = 3.14;
        double xx=r*x*x;
        System.out.println("圆形面积为："+xx);
    }
    public static void Jx(double x,double y){
        double xx=x*y;
        System.out.println("矩形面积为："+xx);
    }
    public static void Sjx(double x,double y,double z){
        double p=0.5*(x+y+z);
        double xx=Math.sqrt(p*(p-x)*(p-y)*(p-z));
        if  ((x < y + z) && (x > Math.abs(y - z))){
            System.out.println("三角形的面积为："+xx);
        }else
            System.out.println("不符合圆的要求请重新输入");
    }
    public static void zhu()
    {
        System.out.println("你要计算图形的面积 1表示圆  2表示矩形  3表示三角形  4表示退出");
    }
}
