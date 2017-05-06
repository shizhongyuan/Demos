package SetFramework;

import java.util.*;

/**
 * Created by Administrator on 2017/4/22 0022.
 */
public class Set02 {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for (int i = 0; i < list.size(); i++) {
            String xx =list.get(i);
            if (xx.equals("bbb")){          //该集合中是否有该元素  equals 固定代码
                list.set(0,"xx");

                System.out.println(list.get(0));
            }
            else
            System.out.println(xx);
        }

        System.out.println("----------------");
        Map<String,String> map1=new HashMap<String, String>();
        map1.put("a1","1");
        map1.put("a2","2");
        map1.put("a3","3");
        Map<String,String>map2=new HashMap<String, String>();
        map2.put("b1","1");
        map2.put("b2","2");
        map2.put("b3","3");
        map1.putAll(map2);        //集合的添加
        System.out.println(map1);
//        map1.remove("a2");          //删除
//        System.out.println(map1);
//        int size = map1.size();
//        System.out.println(size);        //长度

        Set<String> set = map1.keySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Object next = it.next();
            String s = map1.get(next);
            if (next=="b3"){
                System.out.println(next+s);
            }
//            System.out.println(next+s);
        }
    }
}
