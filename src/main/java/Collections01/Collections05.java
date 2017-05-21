package Collections01;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
public class Collections05 {
    public static void main(String[] args){
        int [] arr={3,42,12,51,15};
            System.out.println(Arrays.toString(arr));  // 打印字符串Arrays.toString（） 固定代码
        System.out.println("-----------");
        String [] ar={"nba","cba","mna"};
        List<String> list= Arrays.asList(ar);    // Arrays.asList（） 固定
        boolean n = list.contains("cba");       // 判断数组中有没有该字符contains固定
        System.out.println(n);
        System.out.println("-----------");
        int[] a={54,21,45,21};
        List<int[]> m= Arrays.asList(a);
        System.out.println(m);
    }
}
