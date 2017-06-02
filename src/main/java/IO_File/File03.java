package IO_File;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017/5/24 0024.
 */
public class File03 {
    public static void main(String[] args) throws IOException {             // 创建与删除
//          io_1();               // 文本创建
//         io_2();                // 文本删除
//        io_3();                 // 文件夹的创建
        io_4();                 //文件夹的删除
    }
    public static void io_1() throws IOException {
        File file = new File("E:\\java_io\\io5.xex");
        boolean newFile = file.createNewFile();
        System.out.println("newFile:"+newFile);
    }
    public static void io_2(){
        File file1 = new File("E:\\java_io\\io5.xex");
        boolean delete = file1.delete();
        System.out.println(delete);
    }
    public static void io_3(){
        File file2 = new File("E:\\java_io\\abc");
        boolean mkdir = file2.mkdir();
        System.out.println(mkdir);
    }
    public static void io_4(){
        File file3 = new File("E:\\java_io\\abc");
        boolean delete = file3.delete();
        System.out.println(delete);
    }
}
