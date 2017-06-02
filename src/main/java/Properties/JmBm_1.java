package Properties;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2017/5/30 0030.
 */
public class JmBm_1 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String x = "你好喂";           // 简单的一个编码   注如要编码下面方法要调用
        byte [] arr=x.getBytes("GBK");
//        Bj(arr);

        String s = new String(arr,"GBK");       // 简单的一个解码
        System.out.print("s="+s);
    }
    public static void Bj(byte[] x){
        for (byte b:x){
            System.out.print(b+" ");
        }
    }
}
