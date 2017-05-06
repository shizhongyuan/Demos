package Thegeneric;

/**
 * Created by Administrator on 2017/5/3 0003.
 */
public class Fanx02 {
    public static void main(String[] args){
           so p= new so();
            p.zhu("小黄");
            p.zhu(20);
           sp<Integer> b = new sp<Integer>();           // sp类中下面不定义类型 则可以上面定义类型
           sp<String> c = new sp<String>();
           b.zhu(8);
           c.zhu("小王");

    }
}
interface p<Q>{
    public void zhu(Q q);       // 接口定义泛型
}
class so implements p<String> {         // 一个类实现接口  定义类型
    public void zhu(String s) {
        System.out.println(s);
    }
    public void zhu(Integer z){
        System.out.println(z);
    }
}
class sp<U> implements p<U>{            // 一个类实现接口 不定义类型
    public void zhu(U u)
    {
        System.out.println(u);
    }
}