package IO_File;

import java.io.File;

/**
 * Created by Administrator on 2017/6/22 0022.
 */
public class File05 {
    public static void main(String[] args) {
        File file = new File("c:\\");      // 获取C盘下的文件名称包含隐藏文件
        String[] list = file.list();
        for (String x:list){
            System.out.println(x);
        }
    }
}
