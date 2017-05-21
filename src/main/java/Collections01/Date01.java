package Collections01;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/11 0011.
 */
public class Date01 {
    public static void main(String[] args) {
        long  m = System.currentTimeMillis();       // 时间的定义
        Date x=new Date();                          // 当前时间
        System.out.println(x);
        sj01();
    }
    public static void sj01(){
        Calendar c=Calendar.getInstance();          // 大概就是全部固定代码
        int i = c.get(Calendar.YEAR);           // 表示年
        int i1 = c.get(Calendar.MARCH)+1;       // 表示月
        int i2 = c.get(Calendar.DAY_OF_MONTH);  // 表示日
        int i3 = c.get(Calendar.DAY_OF_WEEK)-1;   // 表示星期
        System.out.println(i+"年"+i1+"月"+i2+"日"+"星期"+i3);        // 当前日期
        System.out.println("------------");
        c.set(2017,3,3);    // 定义年。月。日
        int s = c.get(Calendar.YEAR);           // 表示年
        int s1 = c.get(Calendar.MARCH);       // 表示月
        int s2 = c.get(Calendar.DAY_OF_MONTH);  // 表示日
        System.out.println(s+"---"+s1+"---"+s2);     // 自己定义的时间
    }
}
