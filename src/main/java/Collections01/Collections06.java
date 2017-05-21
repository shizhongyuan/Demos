package Collections01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2017/5/10 0010.
 */
public class Collections06 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("nba");
        list.add("cba");
        list.add("vba");
        String[] x = list.toArray(new String[list.size()]);           // 固定代码
        System.out.println(Arrays.toString(x));     // 集合变数组  Arrays.toString() 固定代码
    }
}
