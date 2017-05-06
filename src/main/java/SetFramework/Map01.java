package SetFramework;

import com.sun.scenario.effect.Identity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2017/4/22 0022.
 */
public class Map01 {
    public static void main(String[] args){
        Map<String,String> map=new HashMap<String, String>();
        map.put("a","1");
        map.put("b","2");
        map.put("b","5");
        Map<String,String> map1=new HashMap<String, String>();
        map1.put("c","3");
        map1.put("d","4");
        map.putAll(map1);           // 添加集合
        System.out.println(map);
        String remove = map.remove("b");        // 删除
        System.out.println(remove);

//        String a = map.get("a");            // 知道 K 找 V
//        System.out.println(a);

        Set<String> set = map.keySet();     // 集合中包含的元素
//        Set<Map.Entry<String, String>> set = map.entrySet();
        Iterator ip = set.iterator();
        while (ip.hasNext()){
            Object next = ip.next();
            String s = map.get(next);
            System.out.println(next+"----"+s);
        }
    }
}
