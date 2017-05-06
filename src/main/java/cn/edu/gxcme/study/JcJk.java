package cn.edu.gxcme.study;

/**
 * Created by Administrator on 2017/4/8 0008.
 */
public class JcJk {
    public static void main(String[] args){
        fu q = new fu();
        q.zhu();

    }
}
class fu implements zi,zhi{
    void zhu(){
        System.out.println(ags+"-----"+name+"----"+x);
    }
//    fu(int ags,String name){
//        this.ags=ags;
//        this.name=name;
//    }
//    public void zhu(){
//        System.out.println(ags+"-----"+name);
//    }
}
interface zi{
    public static final int ags = 30;
    public static final String name="旺财";
}
interface zhi{
    public static final int x=100;
}
