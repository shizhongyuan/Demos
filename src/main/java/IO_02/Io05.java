package IO_02;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/5/21 0021.
 */
public class Io05 {
    public static void main(String[] args) throws IOException {
        io01();
    }
    public static void io01() throws IOException {
        InputStream in = System.in;         // 键盘录入
        int read = in.read();
        System.out.println(read);
    }
}
