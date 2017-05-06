package SetFramework;

import com.sun.scenario.effect.Identity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2017/4/22 0022.
 */
public class Setlxi {
    public static void main(String[] args){
        Set set=new HashSet();
        set.add("a1");
        set.add("a2");
        Set set1=new HashSet();
        set1.add("a3");
        set1.add("a4");
        set.addAll(set1);       // 添加集合
//      set.clear();        // 删除集合的全部元素
        int size = set.size();          // 集合中的元素
        System.out.println(size);

        Iterator ti=set.iterator();
        while (ti.hasNext()){
            Object next = ti.next();
            System.out.println(next);
        }
    }
}
