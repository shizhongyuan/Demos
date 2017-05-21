package IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Administrator on 2017/5/18 0018.
 */
public class Io_06 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Administrator\\IdeaProjects\\java io\\io03.xex");
        BufferedWriter bw = new BufferedWriter(fw);         //  建一个输出流缓存区 提高效率
        bw.write("nbanba");
        bw.newLine();               // 换行
        bw.write("haha");
        bw.close();
    }
}
