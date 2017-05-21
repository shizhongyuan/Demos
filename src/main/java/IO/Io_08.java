package IO;

import java.io.*;

/**
 * Created by Administrator on 2017/5/20 0020.
 */
public class Io_08 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Administrator\\IdeaProjects\\java io\\io03.xex");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter("E:\\java_io\\io2.xex");
        BufferedWriter bw = new BufferedWriter(fw);
                                                                // 复制文本
        String x = null;
        while ((x=br.readLine())!=null){
            bw.write(x);        // 复制中的读一行写一行
            bw.newLine();       // 换行
            bw.flush();         // 刷新文本
        }
        br.close();             // 关闭流
        bw.close();
    }
}
