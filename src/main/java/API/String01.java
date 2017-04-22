package API;

/**
 * Created by Administrator on 2017/4/16 0016.
 */
public class String01 {
    public static void main(String[] args){     // 简单API的构造函数
            String01();
    }
    public static void String01(){
        char [] arr={'a','b','c','x','e'};
        String q = new String(arr,0,3);   //  跟对象不同就是String   对象的是new函数名（String01）
        System.out.println("q="+q);
    }
}
