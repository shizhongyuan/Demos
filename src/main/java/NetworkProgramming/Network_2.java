package NetworkProgramming;

import java.io.IOException;
import java.net.*;

/**
 * Created by Administrator on 2017/6/7 0007.
 */
public class Network_2 {
    public static void main(String[] args) throws IOException {
        System.out.println("发送端启动---");
        // 使用DatagramSocket对象
        DatagramSocket ds = new DatagramSocket();
        // 将数据储存到包中
        String s = "哥们来啦";
        byte[] y = s.getBytes();
        // 发送到那里发送的长度
        DatagramPacket dp = new DatagramPacket(y,y.length, InetAddress.getByName("192.168.1.102"),10000);
        // 发送出去
        ds.send(dp);
        // 关闭资源
        ds.close();
    }
}
