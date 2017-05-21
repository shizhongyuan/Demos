package Collections01;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
public class Collections04 {
    public static void main(String[] args){
        Set<String> p = new TreeSet<String>(Collections.<String>reverseOrder());
        p.add("nba");
        p.add("cba");
        p.add("haha");
        p.add("zzz");
        System.out.println(p);  // 正常按字母排序
                                // 注12行加Collections.<String>reverseOrder() 则为排序倒过来
    }
}
