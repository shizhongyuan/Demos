package IO_File;

import java.io.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/**
 * Created by Administrator on 2017/6/27 0027.
 */
public class io_hb {
    public static void main(String[] args) throws IOException {
        File f = new File("E:\\java_io\\io");
        Io_hb(f);
    }

    public static void Io_hb(File dir) throws IOException {
       ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();

        for (int i = 0; i < 3; i++) {
            al.add(new  FileInputStream(new File(dir,i+".pard")));
        }
        Enumeration<FileInputStream> em = Collections.enumeration(al);
        SequenceInputStream sis = new SequenceInputStream(em);

        FileOutputStream fos = new FileOutputStream(new File(dir,"1.png"));

        byte[] buf =  new byte[1024];
        int len = 0;
        while ((len=sis.read(buf))!=-1){
            fos.write(buf,0,len);
        }
        fos.close();
        sis.close();
    }
}
