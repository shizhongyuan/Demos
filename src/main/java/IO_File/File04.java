package IO_File;

import java.io.File;


/**
 * Created by Administrator on 2017/5/24 0024.
 */
public class File04 {
    public static void main(String[] args) {
//        io_01();            // 判断文件是否存在
        io_02();            // 文件的重命名   注如果是不同目录的情况下则为剪切
    }
    public static void io_01(){
        File file = new File("E:\\java_io\\io4.xex");
        boolean exists = file.exists();
        System.out.println(exists);
    }
    public static void io_02(){
        File file1 = new File("E:\\java_io\\1.mp3");
        File file2 = new File("E:\\java_io\\2.mp3");
        boolean b = file1.renameTo(file2);
        System.out.println(b);
    }
}
