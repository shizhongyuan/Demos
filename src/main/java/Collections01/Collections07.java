package Collections01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/10 0010.
 */
public class Collections07 {
    public static void main(String[] args) {
        List<String> m=new ArrayList<>();
        m.add("mm1");
        m.add("mm2");
        m.add("mm3");
        for (String n: m){
            System.out.println(n);          //  15到16行为快速打印且集合转为元素
        }
        System.out.println("----------");
         int [] arr={3,12,54};
         for (int x:arr){
             System.out.println(x);         // 快速打印
         }
        System.out.println("---------");
        Map<Integer,String> map=new HashMap<>();
        map.put(3,"xaiosan");
        map.put(5,"yi");
        map.put(6,"ba");
        for (Integer x:map.keySet()){           // 快速打印 方法1
            String s = map.get(x);
            System.out.println(x+"=="+s);
        }
        System.out.println("----------");
        for (Map.Entry<Integer,String> n :map.entrySet()){          // 快速打印 方法2
            Integer key = n.getKey();
            String value = n.getValue();
            System.out.println(key+"------"+value);
        }
        System.out.println("---------");
        int zi = zi(6, 5, 4, 6, 52, 14);
        System.out.println(zi);
        System.out.println("-----------");
        double pow = Math.pow(20, 2);           // 表示20的2次方
        System.out.println(pow);
    }
    public static int zi(int... arr){       // 数组的快速加法且元素不定
        int x=0;
        for (int i = 0; i < arr.length; i++) {
            x=x+arr[i];
        }
        return x;
    }
}
