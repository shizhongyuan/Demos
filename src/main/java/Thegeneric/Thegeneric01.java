package Thegeneric;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/4/27 0027.
 */
public class Thegeneric01 {
    public static void main(String[] args){
        List<String> p = new ArrayList<String>();       // 泛型的定义用法 <String>  下面要用的数据类型
        p.add("abc");
        p.add("nba");
//        p.add(3);     // 类型不同 直接报错
        Iterator<String> it= p.iterator();
            while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
