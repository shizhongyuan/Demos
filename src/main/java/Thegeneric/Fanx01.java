package Thegeneric;

/**
 * Created by Administrator on 2017/5/3 0003.
 */
public class Fanx01<S> {
    public static void main(String[] args){
        Fanx01<String> ti=new Fanx01<String>();     // 泛型的定义  名跟类名一样 后面跟着类型
        ti.so("小强");                          // 类型相同则直接定义方法即可
        ti.shuo(new Integer(8));            // 如加新类型则定义方法后new类型加类型数
    }
    public <W>  void shuo(W obj){                   // 定义方法时 <> 在修饰符后返回值前
        System.out.println( "年龄："+obj);
    }
    public <Q> void so(Q o){
        System.out.println("名字："+o);
    }
}
