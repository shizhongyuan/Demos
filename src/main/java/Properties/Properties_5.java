package Properties;

import java.io.*;

/**
 * Created by Administrator on 2017/5/27 0027.
 */
public class Properties_5 {  // 用PrintWriter 对象进行控制台的输入然后将此保存到记事本文件
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new FileWriter("E:\\java_io\\io7.xex"),true);
        String x = null;
        while ((x=br.readLine())!=null){
            if ("123".equals(x))
                break;
            pw.print(x.toUpperCase());
        }
        br.close();
        pw.close();
    }
}
