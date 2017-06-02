package IO_File;

import java.io.File;

/**
 * Created by Administrator on 2017/5/23 0023.
 */
public class Flie01 {
    public static void main(String[] args) {
        File f1 = new File("E:"+File.separator+"java_io"+File.separator+"io4.xex");
        // File.separator 为分隔符   以前是这样写"E:\\java_io\\io4.xex"这样写的弊端是不一定在每个系统都能用
        System.out.println(f1);
    }
}
