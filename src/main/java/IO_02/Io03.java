package IO_02;

import java.io.*;

/**
 * Created by Administrator on 2017/5/21 0021.
 */
public class Io03 {
    public static void main(String[] args) throws IOException {
       zhu();
       zhu02();
    }
    public static void zhu() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\java_io\\io3.xex");      // 字节流的读
        System.out.println(fis.available());        //  注读取文本的字符多少
        int x = 0;
        while ((x=fis.read())!=-1){
            System.out.println((char) x);
        }
        fis.close();
    }
    public static void zhu02() throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\java_io\\io3.xex");        // 字节流的写
        fos.write("nba".getBytes());
        fos.close();
    }
}
