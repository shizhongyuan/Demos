package SetFramework;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017/4/26 0026.
 */
public class Map02 {
    public static void main(String[] args){
        String a="sgbfgsbjfbcugs";
        String x = zhu(a);
        System.out.println(x);
    }
    public static String zhu(String set){
        // 将字符串转成字符数组
   char [] arr=set.toCharArray();
        // 定义Map集合表
   Map<Character,Integer> map = new TreeMap<Character, Integer>();
        for (int i = 0; i < arr.length; i++) {
            // 将数组中的字母作为键去查Map表
            Integer xi = map.get(arr[i]);
            // 判断是否为null
            if (xi==null){
                map.put(arr[i],1);
            }else {
                map.put(arr[i],xi+1);
            }
        }
        return map.toString();
    }
}
