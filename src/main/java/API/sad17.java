package API;

/**
 * Created by Administrator on 2017/4/19 0019.
 */
public class sad17 {
    public static void main(String[] args){
      int [] arr={23,2,5,41,85,21,45,63};
        int xixi=xiao(arr,41);
        System.out.println(xixi);
        paix(arr);
    }
    public static int xiao(int[] arr, int i){          // 数的查找
        for (int x=0;x<arr.length;x++){
            if (arr[x]==i)
                return x;
        }
        return -1;
    }
    static void paix(int []arr){            // 数的排列
        for (int x=0;x<arr.length-1;x++){
            for (int p=x+1;p<arr.length;p++){
                if (arr[x]>arr[p]){
                int zda=arr[x];
                arr[x]=arr[p];
                arr[p]=zda;
                }
            }
        }
       for (int l=0;l<arr.length;l++){
           System.out.print(arr[l]+",");
       }
    }
}
