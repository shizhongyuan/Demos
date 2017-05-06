package Thegeneric01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
public class java01 {
    public static void main(String[] args){
        Set<Zhu01> p=new HashSet<Zhu01>();
        p.add(new Zhu01(20,"小黄人01"));
        p.add(new Zhu01(25,"小黄人02"));
        p.add(new Zhu01(30,"小黄人03"));
        Iterator<Zhu01> it = p.iterator();
        while (it.hasNext()){
            Zhu01 x = it.next();
            System.out.println(x);
        }
    }
}
