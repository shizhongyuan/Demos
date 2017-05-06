package Thegeneric01;

import java.util.*;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
public class FanxTpf01 {
    public static void main(String[] args){
        List <String> x = new ArrayList<String>();         // 这样可放多种类型
        x.add("nba");
        x.add("cba");
        List <Integer> xx = new ArrayList<Integer>();
        xx.add(38);
        xx.add(48);
        zhu(x);
        zhu(xx);
    }
    public static void zhu(Collection<?> x){          // Collection 固定代码    ?为未知类型   这个称为通配符
        Iterator <?> it = x.iterator();                 // ?为未知类型
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
