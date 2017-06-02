package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Administrator on 2017/5/31 0031.
 */
public class Gui_01 {
    public static void main(String[] args) {        // 一个简单的图形化界面
        Frame f = new Frame();      // 一个对象
        f.setBounds(200,200,300,300);       // 坐标到宽高
        f.setLayout(new FlowLayout());      // 设置流布局
        Button b= new Button("按钮");
        f.add(b);

        f.addWindowListener(new WindowAdapter() {       // 事件的关闭    点叉时用的
            public void windowClosing(WindowEvent e) {      // 固定代码
                super.windowClosing(e);                     // 固定代码
//                System.out.println("点不死的 继续喂 嘻嘻 你这个傻逼");      // 如果想给用户点叉出现的提示用这个
                System.exit(0);         // 如果给用户点叉就退出则用这个
            }
        });

        b.addActionListener(new ActionListener() {         // 事件的关闭    点按钮时用的
            public void actionPerformed(ActionEvent e) {    // 固定代码
//                System.out.println("点不死的 继续喂 哈哈 你这个大傻逼");   // 如果想给用户点按钮出现的提示用这个
                System.exit(0);         // 如果给用户点按钮就退出则用这个
            }
        });

        f.setVisible(true);     // 将按钮添加到窗口中
        System.out.println("java_事件监听机制");
    }
}
