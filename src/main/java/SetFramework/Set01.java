package SetFramework;
//import java.util.Collecteion;
import java.util.*;

/**
 * Created by Administrator on 2017/4/21 0021.
 */
public class Set01 {
    public static void main(String[] args){

        // list  --> ArrayList
        // set --> Hastset
        // map --> HastMap
//        List list = new ArrayList();

        List<String> list1 = new ArrayList<String>();

        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");
        List<String> list2 = new ArrayList<String>();
        list2.add("xxx");
        list2.add("yyy");

        // 添加
        list1.addAll(list2);
        System.out.println(list1);
        //  插入
//        list1.add(1,"nba");
//        System.out.println(list1);
//        //删除
//        list1.remove(2);
//        System.out.println(list1);
//        //修改[aaa, xx, ccc]
//        list1.set(1, "xx");
//        System.out.println(list1);
//        //获取
//        list1.get(0);






        //   list1.addAll(3,list2);        插入 在第几个插入那个集合
  //    list1.clear();                   删除集合
//        boolean yyy = list1.contains("yyy");        // 集合是否有该元素 则要弄对象打印出来
//        System.out.println(yyy);
//        boolean b = list1.containsAll(list2);              // 集合是否有该集合的元素   则要弄对象打印出来
//        System.out.println(b);
//        int ccc = list1.indexOf("ccc");             //  该元素在集合中的位置从上数 则要弄对象打印出来
//        int ccc1 = list1.lastIndexOf("ccc");        // 该元素在集合中的位置从下数 则要弄对象打印出来
//        System.out.println(ccc);
//        System.out.println("-----");
//        System.out.println(ccc1);
//        System.out.println("-----");
//        String xxx = list1.set(3, "ppp");   // 在那个位置替换什么元素  则要弄对象打印出来
//        System.out.println(xxx);
//        List<String> strings = list1.subList(3, 6);     // 在那段要调出来元素 注代码
//        boolean contains = list1.remove("aaa");
//        System.out.println(contains);
//        Iterator it=strings.iterator();
//        while (it.hasNext()){
//
//            System.out.println(it.next());
//        }
//        for (int i = 0; i < list1.size(); i++) {
//            String s1 = list1.get(i);
//
//            System.out.println(s1);
//        }
        System.out.println("====================");
        Set<String> set1 = new HashSet<String>();
        set1.add("aaa");
        set1.add("bbb");
        set1.add("ccc");

//for (Iterator it=set1.iterator();it.hasNext();){
//    System.out.println(it.next());
/* List和Set最大的区别
        List可以有重复的元素 Set不可以有重复的元素
  */
        Set<String> set2 = new HashSet<String>();
        set2.add("nba");
        set2.add("cba");
        set2.add("vna");


        set1.addAll(set2);      // 2个集合元素的和打印
        boolean b1 = set1.containsAll(set2);    // 2集合中是否有相同的元素
        System.out.println(b1);


//
//        Iterator<String> iterator = set1.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
        Map<String,String>  map = new HashMap<String, String>();
        map.put("aa","1");
        map.put("bb","2");
        map.put("cc","3");
        map.put("dd","4");

        Map<String,String>  map1 = new HashMap<String, String>();
        map1.put("kk","5");
        map1.put("jj","6");
        map1.putAll(map1);
        map1.remove("aa");

        // jj -  fdsafds
        // kk -- fdsaf54

//        String bb = map.get("dd");
//        System.out.println(bb);
        Set<String> set = map.keySet();
        Iterator y = set.iterator();
        while (y.hasNext()){
            Object next = y.next();
            String value = map.get(next);

            if (next=="bb"){
                String yy = map.get(next);
                System.out.println(next+yy);
            }
        }


//        System.out.println(set);
//        Iterator x= set.iterator();
//        /**
//         * aa --> 1
//         * bb --> 2
//         *
//         */
//        while (x.hasNext()){
//            Object key = x.next();
//            String value = map.get(key);
//            System.out.println(key+value);
//        }

    }
}
