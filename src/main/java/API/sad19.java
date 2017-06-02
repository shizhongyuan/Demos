package API;

/**
 * Created by Administrator on 2017/4/20 0020.
 */
public class sad19 {
    public static void main(String[] args){
        int [][]arr={{34,23,53,34},{34,23,41,89}};
        wei(arr);
    }
    public static void wei(int[][] arr){
        for (int x=0;x<arr.length;x++){
            for (int y=0;y<arr[x].length;y++){

                if (arr.length-1==arr[x][y]){
                    System.out.print(arr[x][y]+",");
                }
                else
                    System.out.print(arr[x][y]+",");
            }
        }
    }
}
