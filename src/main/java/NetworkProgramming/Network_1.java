package NetworkProgramming;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Administrator on 2017/6/7 0007.
 */
public class Network_1 {
    public static void main(String[] args) throws UnknownHostException {
        // 获取本机IP地址和本机名
        InetAddress ip = InetAddress.getLocalHost();
//        ip = InetAddress.getByName("www.baidu.com");        // 获取他人的主机IP
        System.out.println("ip："+ip.getHostAddress());
        System.out.println("名："+ip.getHostName());
    }
}
