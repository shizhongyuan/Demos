package IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

/**
 * Created by Administrator on 2017/5/18 0018.
 */
public class io_07 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Administrator\\IdeaProjects\\java io\\io03.xex");
        BufferedReader br = new BufferedReader(fr);         // 建一个输入流的缓存区
        String x= null;
        while ((x=br.readLine())!=null){
            System.out.println(x);
        }
        br.close();
    }
}
