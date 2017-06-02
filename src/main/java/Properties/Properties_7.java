package Properties;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 2017/5/29 0029.
 */
public class Properties_7 {
    public static void main(String[] args) throws IOException {
//        raf();              // 用RandomAccessFile对象进行名字年龄的描述  写入到文本
        raf_2();            // 用RandomAccessFile对象进行名字年龄的描述  读出到控制台
    }
    public static void raf() throws IOException {       // RandomAccessFile （较简单可读可写）对象的写入文本
    RandomAccessFile raf = new RandomAccessFile("E:\\java_io\\io9.xex","rw"); // 文件后面的固定
        raf.write("张三".getBytes());
        raf.writeInt(97);
        raf.close();
    }
    public static void raf_2() throws IOException {       // RandomAccessFile （较简单可读可写）对象在控制台显示
        RandomAccessFile raf = new RandomAccessFile("E:\\java_io\\io9.xex","r");
        byte [] a = new byte[4];
        raf.read(a);
        String y = new String(a);
        int x = raf.readInt();
        System.out.println(y);
        System.out.println(x);
        raf.close();
    }
}
