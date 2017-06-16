package NetworkProgramming;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/6/14 0014.
 */
public class Theclient_5 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9909);
        Socket s = ss.accept();
        // 获取本地地址
        System.out.println(s.getInetAddress().getHostAddress()+"---------szy");

        InputStream is = s.getInputStream();
        byte [] x=new byte[1024];
        int y = is.read(x);
        String p = new String(x,0,y);
        System.out.println(p);

        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        pw.println("小黄人快拍蚊子");
        s.close();
        ss.close();
    }
}
