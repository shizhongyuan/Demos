package IO;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;
import javax.sql.rowset.spi.SyncFactory;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Io_01 {
    private static final String LINE_SEPARATO = System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {     // 因为可能产生异常所以要抛出throws IOException
        FileWriter io=new FileWriter("C:\\Users\\Administrator\\IdeaProjects\\java io\\io01.xex",true);
        // 输出流的定义 FileWriter  注括号里面为文件名加后缀名       注电脑帮你建
        io.write("ab13"+ LINE_SEPARATO+"2c");        // 添加字符   LINE_SEPARATO 换行  注16行代码要声明
        io.write("nba");            //  在上面的基础上加字符 在13行（new对象 ）后面加true
        io.flush();             // 刷新 文件
        io.close();           // 关闭流
        System.out.println("--------------------------");
        FileReader fileReader=new FileReader("C:\\Users\\Administrator\\IdeaProjects\\java io\\io.xex");
        // 字符流的定义 FileReader  注括号里面为文件名加后缀名    注自己建文件
//        System.out.println((char) fileReader.read());
//        System.out.println((char) fileReader.read());
         int xx=0;
        while (true) {
            char[] buf = new char[10];
            int read = fileReader.read(buf);
            xx=xx+read;
            if (read==-1){
            break;
            }
        }
        System.out.println(xx);
//
//        read = fileReader.read(buf);
//        System.out.println(read);

    }
}


