package API;

/**
 * Created by Administrator on 2017/4/18 0018.
 */
public class String05 {
    public static void main(String[] args){      // 字符串的排序
        String [] arr={"nba","cba","szy","gsm"};
        System.out.println("排前：");
        for (int x=0;x<arr.length;x++){
            System.out.print(arr[x]+",");
        }
        for (int y=0;y<arr.length-1;y++){
            for (int l=y+1;l<arr.length;l++){
                if (arr[y].compareTo (arr[l])>0){
                    String xx=arr[y];
                    arr[y]=arr[l];
                    arr[l]=xx;
                }
            }
        }
        System.out.println();
        System.out.println("排后");
        for (int x=0;x<arr.length;x++){
        System.out.print(arr[x]+",");
        }
    }
}
