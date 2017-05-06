package cn.edu.gxcme.study;

/**
 * Created by Administrator on 2017/4/7 0007.
 */
public class Cf99 {
    public static void main(String[] args){
//            Fu q = new Fu(30);
//            q.f();
        Zi p = new Zi("旺财");
        p.z();
    }
}
/* final  注如果加这个意思就是不可以继承本类 */   class Fu
{
    int x;
    Fu(){
        x=100;
    }
}
class Zi extends Fu
{
    String naem;
    Zi(String naem){
        this.naem=naem;
    }
    void z(){
        System.out.println(naem+"------"+x);
    }
}