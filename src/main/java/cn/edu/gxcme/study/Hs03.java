package cn.edu.gxcme.study;

/**
 * Created by Administrator on 2017/4/3 0003.
 */
public class Hs03 {
    public static void main(String[] args)
    {
        Cf99();
        Cf99(4);
    }
    public static void Cf99()
    {
      for (int x=1;x<=9;x++)
      {
      for (int y=1;y<=x;y++)
        {
            System.out.print(y+"*"+x+"="+y*x+"\t");
        }
          System.out.println();
      }
        System.out.println("-----------------");
    }
    public static void Cf99(int xx)
    {
        for (int x = 1; x <= xx; x++)
        {
            for (int y = 1; y <= x; y++)
            {
                System.out.print(y + "*" + x + "=" + y * x + "\t");
            }
            System.out.println();
        }
    }
}