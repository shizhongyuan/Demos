package cn.edu.gxcme.study;

/**
 * Created by Administrator on 2017/4/3 0003.
 */
public class Hs02 {
    public static void main(String[] args)
    {
        aii(4,6);
    }
    public static void aii(int xx,int yy)
        {
            for (int x=1;x<xx;x++)
            {
                for (int y=1;y<yy;y++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            return;   // 可不写
        }
}
