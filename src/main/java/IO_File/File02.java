package IO_File;

import javax.xml.crypto.Data;
import java.io.File;
import java.text.DateFormat;
import java.util.Date;

import static java.text.DateFormat.LONG;

/**
 * Created by Administrator on 2017/5/24 0024.
 */
public class File02 {
    public static void main(String[] args) {
        File_1();
    }

    public static void File_1() {
        File file = new File("E:\\java_io\\io4.xex");           // 获取方法

        String name = file.getName();       // 文件名称

        String absolutePath = file.getAbsolutePath();  //文件路径  绝对路径

        String path = file.getPath();               // 文件路径  相对路径

        long length = file.length();                // 文件大小

        long l = file.lastModified();               // 文件最近修改时间
        Date date = new Date(l);
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        String format = dateFormat.format(date);
        // 30到32行代码为讲时间改为我们通看见的时间格式


        System.out.println("文件名称:"+name);
        System.out.println("绝对路径:"+absolutePath);
        System.out.println("相对路径:"+path);
        System.out.println("文件大小"+length);
        System.out.println("文件最近修改时间"+l);
        System.out.println("文件最近修改时间"+format);
    }
}
