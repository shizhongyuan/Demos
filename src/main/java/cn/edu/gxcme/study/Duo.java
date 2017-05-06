package cn.edu.gxcme.study;

/**
 * Created by Administrator on 2017/4/9 0009.
 */
public class Duo {
    public static void main(String[] args){
            Dong n = new Mao();         // 一般多态的调用
            Dong m = new G();
//          n.Chi();                    //  注一般调用不可以调用该类的特有方法

            Mao a = (Mao) n;            // 多态的向上转型
            a.Chi();                    //  向上转型才可调用该类的特有方法
            a.mao();

            G l =(G)m;
            l.Chi();
            l.g();


            Mao x = new Mao();
            G c = new G();
            zhu(x);
            zhu(c);
    }
//    public static void zhu(Mao a){             一般的调用
//        a.Chi();
//        a.mao();
//    }
//    public static void zhu(G b){
//        b.Chi();
//        b.g();
//    }
    public static void zhu(Dong z){             // 多态的体现
        z.Chi();
    }
}
abstract class Dong{
 abstract void Chi();           // 定义一个动物的行为 吃
}
class Mao extends Dong{     // 定义一个猫的类 继承动物的行为吃
    void Chi(){
        System.out.println("吃饭");
    }
    void mao(){
        System.out.println("抓老鼠");
    }
}
class G extends Dong{
    void Chi(){
        System.out.println("吃骨头");
    }
    void g(){
        System.out.println("看家");
    }
}