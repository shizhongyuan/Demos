package Properties;


import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by Administrator on 2017/5/27 0027.
 */
public class Properties_4 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("E:\\java_io\\io6.xex");   // PrintStream 对象的保存
        ps.print("我们是");
        ps.close();
    }
}
