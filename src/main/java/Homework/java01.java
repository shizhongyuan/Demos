package Homework;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/21 0021.
 */
public class java01 {
    public static void main(String[] args) {
        System.out.println("请按1 回车 请输入帐号：");
        Scanner kh=new Scanner(System.in);
        int xx=kh.nextInt();
        try {
            yc01 p = new yc01(xx);
        } catch (Homework.yc02 yc02) {
            yc02.printStackTrace();
        } catch (Homework.yc03 yc03) {
            yc03.printStackTrace();


        }
        System.out.println("请输入密码：");
        Scanner k=new Scanner(System.in);
        int x=k.nextInt();
        try {
            yc01 p = new yc01(x);
        } catch (Homework.yc02 yc02) {
            yc02.printStackTrace();
        } catch (Homework.yc03 yc03) {
            yc03.printStackTrace();
        }

    }
}
class yc01{
    int x;
    int y;
    yc01(int x)throws yc02,yc03{
        this.x=x;
        this.y=y;
        if (x!=1067164628){
            throw new yc02("帐号出错");
        }
        if (y!=95927){
            throw new yc03("密码出错");
        }
        System.out.println("账号 密码都对啦  登入成功");
    }
}
class yc03 extends Exception{
    yc03(String y){
        System.out.println(y);
        System.out.println("重新输入");
    }
}
class yc02 extends Exception{
    yc02(String x){
        System.out.println(x);
        System.out.println("重新输入");
    }
}