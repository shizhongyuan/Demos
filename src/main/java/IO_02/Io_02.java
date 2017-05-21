package IO_02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * Created by Administrator on 2017/5/20 0020.
 */
public class Io_02 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("E:\\java_io\\io2.xex");
        LineNumberReader lnr = new LineNumberReader(fr);
        String x = null;
        lnr.setLineNumber(100);         //  setLineNumber 意思是从那行开始算
        while ((x=lnr.readLine())!=null){
            System.out.println(lnr.getLineNumber()+":"+x);      //注加 getLineNumber() 为要打印的行数
        }
        lnr.close();
    }
}
