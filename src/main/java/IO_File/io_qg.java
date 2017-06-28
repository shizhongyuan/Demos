package IO_File;

import com.sun.xml.internal.org.jvnet.fastinfoset.FastInfosetSource;

import java.io.*;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
public class io_qg {
    private static final int M = 1024 * 1024;

    public static void main(String[] args) throws IOException {
        File f = new File("E:\\java_io\\123.png");
        Io_pg(f);
    }

    public static void Io_pg(File fl) throws IOException {
        // 用读取流关联一个源文件
        FileInputStream fis = new FileInputStream(fl);

        // 定义一个1M的缓存区
        byte [] by = new byte[M];

        // 创建一个目的
        FileOutputStream fos = null;

        int len =0;
        int x =1;

        File dir = new File("E:\\java_io\\io");
        if (!dir.exists())
            dir.mkdirs();

        while ((len=fis.read(by))!=-1){
            fos = new FileOutputStream(new File(dir,(x++)+".pard"));
            fos.write(by,0,len);
        }
        fos.close();
        fis.close();
    }
}
