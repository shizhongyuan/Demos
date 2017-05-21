package IO_02;

/**
 * Created by Administrator on 2017/5/20 0020.
 */
public class Io_01 {
    public static void main(String[] args) {
        io o = new io();
        io01 m = new io01(o);
        m.chifan();
    }
}
class io{
    void chifan(){
        System.out.println("吃饭");
    }
}
class io01{             // 装饰设计模式  意思是在一个事物的前提下进行升级改装
    private io p;
    io01(io p){
        this.p = p;
    }

    public void chifan(){
        System.out.println("开胃酒");
        p.chifan();
        System.out.println("甜品");
    }
}