package Properties;

import java.io.*;
import java.util.Properties;

/**
 * Created by Administrator on 2017/5/26 0026.
 */
public class Properties_2 {
    public static void main(String[] args) throws IOException {
        Properties_05();
    }

    public static void Properties_02() {            // 输出
        Properties pp = new Properties();           // Properties集合用流输出
        pp.setProperty("小黄","25");
        pp.setProperty("小蓝","28");
        pp.setProperty("小红","20");
        pp.list(System.out);
    }
    public static void Properties_03() throws IOException {     // 存储
        Properties pp1 = new Properties();           // Properties集合
        pp1.setProperty("xiaohuang","25");         // 注不要写中文
        pp1.setProperty("xiaolan","28");
        pp1.setProperty("xiaohong","20");
        // 讲元素保存到一个记事本中
        FileOutputStream fos = new FileOutputStream("E:\\java_io\\io5.xex");
        pp1.store(fos,"name+ags");
        fos.close();
    }
    public static void Properties_04() throws IOException {     // 取出 获取
        Properties pp2 = new Properties();                   // Properties集合
        FileInputStream fis = new FileInputStream("E:\\java_io\\io5.xex");
        pp2.load(fis);
        pp2.list(System.out);               // 将一个记事本文件的内容在控制台输出
    }
    public static void Properties_05() throws IOException {     // 修改配置信息
        File file = new File("E:\\java_io\\io5.xex");
        if (!file.exists()){        // 如果没有该文件 则创建并且加载下面元素
            file.createNewFile();
        }
        FileReader fr = new FileReader(file);           // 读取流
        Properties pp3 = new Properties();              // Properties集合
        pp3.load(fr);
        pp3.setProperty("xiaolan","18");               // 讲xiaolan 的后面数字改为18

        FileWriter fe = new FileWriter(file);           // 写入流
        pp3.store(fe,"");
        fr.close();                                     // 关闭流
        fe.close();                                     // 关闭流
    }
}
