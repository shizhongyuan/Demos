package Properties;

import java.io.*;

/**
 * Created by Administrator on 2017/5/29 0029.
 */
public class DataStream_1 {
    public static void main(String[] args) throws IOException {
//        da_2();           // 写入
        ds_1();             // 读出
    }
    public static void ds_1() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("E:\\java_io\\io10.xex"));
        String s = dis.readUTF();
        System.out.println(s);
        dis.close();
    }
    public static void da_2() throws IOException {
       DataOutputStream dis = new DataOutputStream(new FileOutputStream( "E:\\java_io\\io10.xex"));
       dis.writeUTF("你好小强");
       dis.close();

    }
}
