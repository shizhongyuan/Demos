package NetworkProgramming;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Administrator on 2017/6/13 0013.
 */
public class Theclient_3 {
    public static void main(String[] args) throws IOException {
        // 上次相片到到服务端          客户端
        // 创建Socket对象
        Socket s = new Socket("127.0.0.1",10005);
        // 读取服务端要上传的相片
        FileInputStream fs = new FileInputStream("E:\\java_io\\123.jpg");
        //获取Socket对象将数据发给服务端
        OutputStream os = s.getOutputStream();
        byte[] x = new byte[1024];
        int y = 0;
        while ((y=fs.read(x))!=-1){
            os.write(x,0,y);
        }
        // 告诉客户上传成功
        s.shutdownOutput();

        // 读取服务端发来的内容
        InputStream is = s.getInputStream();
        byte [] x1 = new byte[1024];
        int y1 = is.read(x);
        String io = new String(x,0,y1);
        System.out.println(io);

        s.close();
        fs.close();
    }
}
