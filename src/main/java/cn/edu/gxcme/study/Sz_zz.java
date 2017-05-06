package cn.edu.gxcme.study;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
public class Sz_zz {
public static void main(String[] args)          //数组中求最大值
{
        int [] arr={-12,-23,-123,-56,-74,-97,-57,-35};
        int zda=Zz(arr);
    System.out.println(zda);
}
public static int Zz(int [] arr)
{
    int zda=arr[0];                 //如果为正数改为 int zda=0；
    for (int x=0;x<arr.length;x++)
    {
        if (arr[x]>zda)
            zda=arr[x];
    }
        return zda;
    }
}

