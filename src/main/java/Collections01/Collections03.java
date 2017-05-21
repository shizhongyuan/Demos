package Collections01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2017/5/7 0007.
 */
public class Collections03 {
    public static void main(String[] args){
        Co_03();
    }
    public static void Co_03(){
        List<String> n = new ArrayList<String>();
        n.add("nba");
        n.add("cbacc");
        n.add("ccch");
        Collections.sort(n);                // 排序
        System.out.println(n);              // 随机打乱打印
        Collections.shuffle(n);
        System.out.println(n);
        System.out.println("------------");
        int ccch = Collections.binarySearch(n, "ccch");     // 查找
        System.out.println(ccch);
        String max = Collections.max(n);            // 获取最大值
        System.out.println(max);
    }

}
