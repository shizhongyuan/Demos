package SetFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
public class Map03 {
    public static void main(String[] agrs){
        Map<Integer,String> hm=new HashMap<Integer, String>(); //这样打印则为有序   如LinkedHashMap为无序
        hm.put(5,"小五");
        hm.put(3,"小三");
        Iterator<Map.Entry<Integer,String>> it = hm.entrySet().iterator();      // 固定代码
        while (it.hasNext()){
            Map.Entry<Integer,String>me=it.next();          // 固定代码
            Integer key = me.getKey();
            String value = me.getValue();
            System.out.println(key+"----"+value);
        }
    }
}
