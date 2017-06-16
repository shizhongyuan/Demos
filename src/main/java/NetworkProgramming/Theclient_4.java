package NetworkProgramming;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Theclient_4 {
    public static void main(String[] args) throws IOException {
        // 服务端
        //创建一个tcp的Socket服务端
        ServerSocket ss = new ServerSocket(10005);
        // 获取客户端
        Socket s = ss.accept();
        // 读取客户端发来的数据
        InputStream is = s.getInputStream();
        // 将数据储存到一个地方
        FileOutputStream fos = new FileOutputStream("E:\\java_io");

        byte[] x = new byte[1024];
        int y = 0;
        while ((y=is.read(x))!=-1){
            fos.write(x,0,y);
        }
        // 获取Socket输出流，将上传成功告诉客户端
        OutputStream os = s.getOutputStream();
        os.write("上传成功".getBytes());
        fos.close();
        s.close();
        ss.close();
    }
}
