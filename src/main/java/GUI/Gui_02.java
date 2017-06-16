package GUI;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by Administrator on 2017/6/2 0002.
 */
public class Gui_02 {
    private Frame f;            // 3个事件的描述  一个表格的输入  一个叉的关闭  一个按钮
    private TextField tf;
    private Button b;

  public Gui_02(){
      init();
  }
    private void init() {
        f = new Frame("演示鼠标键盘事件");
        f.setBounds(200,200,300,400);        // 坐标到宽高
        f.setLayout(new FlowLayout());                 // 设置流布局
        tf = new TextField(20);         // 创建表格的且有长度
        f.add(tf);                      // 使用表格
        xiao();
        b = new Button("按钮");     // 创建按钮
        f.add(b);                       // 使用按钮
//        xiao_01();
        f.setVisible(true);             // 将按钮添加到窗口中

    }


    private void xiao_01() {
        b.addMouseListener(new MouseAdapter() {
            int x=1;
            public void mouseEntered(MouseEvent e) {
//                System.out.println("java"+x);     // 鼠标经过按钮在控制台显示
                tf.setText("java"+x++);           // 鼠标经过按钮在表格中显示
            }
            public void mouseClicked(MouseEvent e){
                if (e.getClickCount()==2)
                tf.setText("java"+x++);           // 鼠标点击按钮2次在表格中显示
            }
        });

    }


    private void xiao() {           //  键盘输入到文本框
        tf.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                char keyChar = e.getKeyChar();
                if (!(keyChar>=KeyEvent.VK_0 && keyChar<=KeyEvent.VK_9)){       // 数字必须在0-9中
                    System.out.println("输入必需为数字");          // 如果输入不是0-9则控制台输出 该文字
                    e.consume();                        //  如果在文本框中输入不在规定里面则文本框不显示在文本框
            }
            }
        });


        f.addWindowListener(new WindowAdapter() {             // 固定代码
            public void windowClosing(WindowEvent e) {       // 固定代码
                System.exit(0);        // 如果给用户点叉就退出则用这个
            }
        });
    }

    public static void main(String[] args) {
        new Gui_02();
    }
}
