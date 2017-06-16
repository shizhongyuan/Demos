package NetworkProgramming;

import java.io.IOException;

import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Administrator on 2017/6/10 0010.
 */
public class Theclient_1 {
    public static void main(String[] args) throws IOException {
        // 客户端发送数据到服务台
        // 创建客户端Socket服务
        Socket socket = new Socket("192.168.1.102",10001);
        // 获取 Socket流中的输出流
        OutputStream os = socket.getOutputStream();
        //使用输出流将指定数据写出去
        os.write("小石 来啦".getBytes());
        // 关闭资源
        socket.close();
    }
}
