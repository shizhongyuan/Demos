package SetFramework;

import com.sun.scenario.effect.Identity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/4/22 0022.
 */
public class List01 {
    public static void main(String[] aegs){
        List list=new ArrayList();
        list.add("aa");
        list.add("bb");
        List list1=new ArrayList();
        list1.add("cc");
        list1.add("Db");
//        List xx = list.subList(0, list.size());          //查找的元素那里到那里 定义方法
        // 添加
        list.addAll(list1);
        System.out.println(list);
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
        Iterator it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
