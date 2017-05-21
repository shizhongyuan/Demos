package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Administrator on 2017/5/17 0017.
 */
public class Io_04 {
    public static void main(String[] args) throws IOException {
        FileReader sz = new FileReader("C:\\Users\\Administrator\\IdeaProjects\\java io\\io.xex");
        char [] arr = new char[5];
        int x=0;
        while ((x=sz.read(arr))!=-1){
            System.out.println(new String(arr,0,x));        // 打印全部字符   数组循环打印   方法2  快
        }
//        int read = sz.read(arr);
//        System.out.println(read+":"+new String(arr,0,read));
//        int read1=sz.read(arr);
//        System.out.println(read1+":"+new String(arr,0,read1));
        sz.close();     // 关闭 输入流
    }
}
