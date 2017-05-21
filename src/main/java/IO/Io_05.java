package IO;

import java.io.*;

/**
 * Created by Administrator on 2017/5/17 0017.
 */
public class Io_05 {
    public static void main(String[] args) throws IOException {         // 方法1
        FileReader sr = new FileReader("C:\\Users\\Administrator\\IdeaProjects\\java io\\io.xex");
        //  读取一个已有的文本
        FileWriter sw = new FileWriter("E:\\java_io\\io.xex");
        // 创建一个目的 将上面文本复制过来
        int x=0;
        while ((x=sr.read())!=-1){    //  读取文本字符
            sw.write(x);               //  接收上面读取的字符
        }
        sr.close();     // 关闭 输入流
        sw.close();     // 关闭 输出流
    }
}
