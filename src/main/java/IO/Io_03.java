package IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Administrator on 2017/5/17 0017.
 */
public class Io_03 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Administrator\\IdeaProjects\\java io\\io.xex");
        int xx=0;
        while ((xx=fr.read())!=-1){
            System.out.print((char)xx);     // 读取全部在文本中的字符      单个循环打印   方法1  蛮
        }
        fr.close();     // 关闭 输入咯
    }
}
