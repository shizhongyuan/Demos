package API;

/**
 * Created by Administrator on 2017/4/17 0017.
 */
public class sad15 {
    public static void main(String[] args){         // 数字的排序
        int []arr={12,20,52,41,18,95,32,42,54};{
            System.out.println("打印前：");
            for (int x=0;x<arr.length;x++){
                System.out.print(arr[x]+",");
            }
            for (int y=0;y<arr.length-1;y++){
                for (int t=y+1;t<arr.length;t++){
                    if (arr[y]>arr[t]){
                        int xx=arr[y];
                        arr[y]=arr[t];
                        arr[t]=xx;
                    }
                }
            }
            System.out.println();
            System.out.println("打印后：");
            for (int x=0;x<arr.length;x++){
                System.out.print(arr[x]+",");
            }
        }
    }
}
