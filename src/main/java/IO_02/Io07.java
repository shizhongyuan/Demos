package IO_02;

import java.io.*;

/**
 * Created by Administrator on 2017/5/23 0023.
 */
public class Io07 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("E:\\java_io\\io4.xex"));
        osw.write("小虎");
        osw.close();
        FileReader fr = new FileReader("E:\\java_io\\io4.xex");
        char [] n=new char[10];
        int read = fr.read(n);
        String xx = new String(n,0,read);
        System.out.println(xx);
    }
}
