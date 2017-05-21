package IO;


import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Administrator on 2017/5/15 0015.
 */
public class Io_02 {
    public static void main(String[] args) {
        FileWriter yc = null;
        try {
            yc = new FileWriter("c:\\Users\\Administrator\\IdeaProjects\\java io\\io02.xex");
            yc.write("nbacba");
            yc.flush();


        } catch (IOException e) {
            System.out.println(e.toString());
        }finally {
            try {
                yc.close();
            } catch (IOException e) {
               throw new RuntimeException("关闭失败");  // 如果路径出错则报异常  对则成功建文本文件
            }
        }

    }
}
