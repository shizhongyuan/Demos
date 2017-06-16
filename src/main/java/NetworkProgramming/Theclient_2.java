package NetworkProgramming;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/6/10 0010.
 */
public class Theclient_2 {
    public static void main(String[] args) throws IOException {
        // 创建服务端对象
        ServerSocket ss = new ServerSocket(10001);

        // 获取客户端链接过来的对象
        Socket s = ss.accept();
        String ip = s.getInetAddress().getHostAddress();

        // 通过Socket对象获取输入流 要读取客户端发过来的数据
        InputStream is= s.getInputStream();

        byte [] arr = new byte[1024];

        int read = is.read(arr);

       String x = new String(arr,0,read);
       System.out.println(ip+" : "+x);
       s.close();
       ss.close();
    }
}
