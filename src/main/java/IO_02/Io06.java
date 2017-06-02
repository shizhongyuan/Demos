package IO_02;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

/**
 * Created by Administrator on 2017/5/22 0022.
 */
public class Io06 {
    public static void main(String[] args) throws IOException { // 键盘输入 将小写转成大写
        System.out.println("请输入你要输入的字 如果是英文则转为大写 如输入123程序跳出且结束 ");
        InputStream in = System.in;
        // 字节流
        InputStreamReader p = new InputStreamReader(in);
        // 将字节流转换为字符流的桥梁
        LineNumberReader m = new LineNumberReader(p);
        // 字符流

        String x=null;
        while ((x=m.readLine())!=null){         // 括号里面代码一般固定
            if ("123".equals(x)) {               // 如果输入123 则跳出 且程序结束
                System.out.println("谢谢你的使用");
                break;
            }
            System.out.println(x.toUpperCase());        // 输出括号里面一般为固定代码
        }
    }
}
