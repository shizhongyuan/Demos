package cn.edu.gxcme.study;

/**
 * Created by Administrator on 2017/4/2 0002.
 */
public class Fz {
       private int ags;
       public void cc(int c)
        {
            if (c<0 || c>130)
            {
                System.out.println("出错");
            }
            else
                ags=c;
            System.out.println("======"+c);
        }
}
class zhu
{
    public static void main(String[] args)
    {
        Fz p = new Fz();
        p.cc(-10);
    }
}