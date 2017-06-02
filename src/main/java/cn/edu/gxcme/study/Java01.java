package cn.edu.gxcme.study;

/**
 * Created by Administrator on 2017/3/26 0026.
 */
public class Java01 {
 public static void main(String[] args) {
     for (int t = 5; t >= 1; t--)       //for循环嵌套   类型6       如要改变图像方向只改for(int t = 1;t<=5;t++)
     {
         for (int u = 1; u < t; u++) {
             System.out.print(" ");
         }

         for (int i = t; i <= 5; i++) {
             System.out.print("* ");
         }
         System.out.println();
     }
     System.out.println("-----------");
     for (int d=1;d<=5;d++)          //for循环嵌套   类型4
     {
         for (int f=1;f<=d;f++)
         {
             System.out.print(d);
         }
         System.out.println();
     }
     System.out.println("-----------");
     for (int w=1;w<=5;w++)          //for循环嵌套   类型3
     {
         for (int e=5;e>=w;e--)
         {
             System.out.print(e);

         }
         System.out.println();
     }
    }
}
