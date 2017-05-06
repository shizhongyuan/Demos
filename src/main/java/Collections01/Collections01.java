package Collections01;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
public class Collections01 {
    public static void main(String[] args){
       Co_01();
    }
    public static void Co_01(){
        List<String> p = new ArrayList<String>();
        p.add("nba");
        p.add("cbacc");
        p.add("ccch");
        System.out.println(p);      // 排序前
        Collections.sort(p,Collections.<String>reverseOrder());         // 固定代码
        System.out.println(p);       // 排序后     自然排序(按长度排)

        // Collections.sort(p);        // 固定代码
//        System.out.println(p);     // 排序后      自然排序(按字母排)
    }
}
