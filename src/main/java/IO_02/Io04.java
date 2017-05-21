package IO_02;

import java.io.*;

/**
 * Created by Administrator on 2017/5/21 0021.
 */
public class Io04 {
    public static void main(String[] args) throws IOException {
//        MP3();
        MP3_01();
    }

    public static void MP3_01() throws IOException {        // 方法2  加缓存区方法
        FileInputStream fis = new FileInputStream("E:\\java_io\\1.mp3");
        BufferedInputStream fs = new BufferedInputStream(fis);
        FileOutputStream fos = new FileOutputStream("E:\\java_io\\3.mp3");
        BufferedOutputStream fo = new BufferedOutputStream(fos);
        int x = 0;
        while ((x=fs.read())!=-1){
            fos.write(x);
        }
        fis.close();
        fos.close();
    }
    public static void MP3() throws IOException {       // 方法1  数组方法
        FileInputStream fis = new FileInputStream("E:\\java_io\\1.mp3");
        FileOutputStream fos = new FileOutputStream("E:\\java_io\\2.mp3");
        byte [] arr= new byte[1024];
        int x = 0;
        while ((x=fis.read(arr))!=-1){      // 里面要加数组参数  否则文件很大
            fos.write(arr,0,x);
        }
        fis.close();
        fos.close();
    }
}
