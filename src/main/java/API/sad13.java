package API;

/**
 * Created by Administrator on 2017/4/17 0017.
 */
public class sad13 {
    public static void main(String[]args){
        int[] arr = {21, 23, 4, 343, 123, 54, 342, 34, 221};          // 数组打印的 平均值 最大值  最小值
        int pj=0;
        int max = arr[0];
        int xx=arr[0];
        for (int x = 0; x < arr.length; x++)
        {
            pj = pj+arr[x];
            if (arr[x]>max){
                max = arr[x];
            }
            if(arr[x]<xx){
            xx=arr[x];
            }
        }
        double pingj=(double) pj/9;
        System.out.println(pingj);
        System.out.println(max);
        System.out.println(xx);
}
}
