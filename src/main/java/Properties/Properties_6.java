package Properties;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Administrator on 2017/5/28 0028.
 */
public class Properties_6 {
    public static void main(String[] args) throws IOException {         // 将多个文本的内容合并到一个文本中
        Vector<FileInputStream> v = new Vector<FileInputStream>();      // 建一个对象把要合并内容的文本封装起来
        v.add(new FileInputStream("E:\\java_io\\io5.xex"));
        v.add(new FileInputStream("E:\\java_io\\io4.xex"));
        v.add(new FileInputStream("E:\\java_io\\io3.xex"));

        Enumeration<FileInputStream> e = v.elements();
        SequenceInputStream sis = new SequenceInputStream(e);
        FileOutputStream fo = new FileOutputStream("E:\\java_io\\io8.xex");     // 要把内容放到的文本

        byte a []= new byte[1024];      // 用数组方法进行读写
        int x=0;
        while ((x=sis.read(a))!=-1){
            fo.write(a,0,x);
        }
        sis.close();
        fo.close();
    }
}
