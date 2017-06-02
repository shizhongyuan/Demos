package Properties;

import java.util.Properties;
import java.util.Set;

/**
 * Created by Administrator on 2017/5/25 0025.
 */
public class Properties_1 {
    public static void main(String[] args) {
        Properties_01();
    }

    public static void Properties_01(){     // 用Properties方法写出集合
        Properties pp = new Properties();
        pp.setProperty("小黄","25");
        pp.setProperty("小蓝","28");
        pp.setProperty("小红","20");

        // 修改元素
        pp.setProperty("小蓝","22");
        Set<String> x = pp.stringPropertyNames();
        for (String y:x){
            String property = pp.getProperty(y);
            System.out.println(y+"===="+property);
        }
    }
}
