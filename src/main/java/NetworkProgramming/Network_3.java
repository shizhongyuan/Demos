package NetworkProgramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by Administrator on 2017/6/9 0009.
 */
public class Network_3 {
    public static void main(String[] args) throws IOException {
        System.out.println("接收端启动---");
        // 使用DatagramSocket对象
        DatagramSocket ds = new DatagramSocket(10000);
        // 创建数据包
        byte[] y = new byte[1024];
        DatagramPacket dp = new DatagramPacket(y,y.length);
        // 将数据储存到数据包中
        ds.receive(dp);
        // 通过数据包解析数据 比如 地址 端口 数据内容
        String ha = ds.getInetAddress().getHostAddress();
        int gp = ds.getPort();
        String s = new String(dp.getData(),0,dp.getLength());
        System.out.println(ha+":"+gp+":"+s);
        // 关闭资源
        ds.close();
    }
}