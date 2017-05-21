package API;

/**
 * Created by Administrator on 2017/4/20 0020.
 */
public class String07 {
    public static void main(String[] agrs){
    ted();
    sanc();
    gai();
    chaz();
    fanz();
    }

    private static void ted() {         // 插入
        StringBuffer x = new StringBuffer("xiaoshu");       // 要打印的数  StringBuffer固定代码
        x.append("haha");           // 要打印的数append 固定代码
        x.insert(4,"shi");          // 任意地方插入insert固定代码
        System.out.println(x);
    }
    public static void sanc(){      // 删除
        StringBuffer x = new StringBuffer("xiaoshu");
        x.delete(1,4);              // 注删除时包含头不包含尾 delete固定代码
//        x.delete(0,x.length());     // 注删除全部delete(0,x.length());固定代码
        System.out.println(x);
    }
    public static void  gai(){      //修改
        StringBuffer x = new StringBuffer("xiaoshu");
        x.setCharAt(2,'x');  //  要在那改成什么setCharAt固定daim
        System.out.println(x);
    }
    public static void chaz(){      //  查找
        StringBuffer x = new StringBuffer("xiaoshu");
        x.setLength(3);         // 找的长度
        System.out.println("你找的长度对应的数为："+x);
    }
    public static void fanz(){      //  翻转
        StringBuffer x = new StringBuffer("xiaoshu");
        System.out.println(x.reverse());           // 数在打印时反过来reverse()固定代码
    }
}
