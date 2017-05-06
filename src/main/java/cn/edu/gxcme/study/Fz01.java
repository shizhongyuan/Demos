package cn.edu.gxcme.study;

/**
 * Created by Administrator on 2017/4/3 0003.
 */
public class Fz01 {
    public static void main(String[] args)
    {
        zu p = new zu();
        p.han(-30);
    }
}
class zu
{
   private int ags;
    public void han(int x)
        {
          if (x>0  && x<130)
          {
              ags=x;
              System.out.println("x="+x);
          }
          else
           System.out.println("错误年龄不可以为负数或者0");
        }
}