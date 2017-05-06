package cn.edu.gxcme.study;

/**
 * Created by Administrator on 2017/4/9 0009.
 */
public class Nbulei {
    public static void main(String[] args){
        da1.da2 n = new da1().new da2();        // 内部类的访问格式 类。类 名 = new 类。new 类
            n.zhu();
    }
}
class da1{              //  类中有类 这叫内部类
        private int x=100;
        class da2{
            void zhu(){
                System.out.println("-------"+x);
            }
    }
}