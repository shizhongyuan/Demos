package Thegeneric01;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
public class yc03 {
    public static void main(String[] args){
        try {
            Ms n = new Ms(38,"哈哈");
        } catch (YY yy) {
            yy.printStackTrace();
        }
    }
}
class Ms{
    private int nl;
    private String mz;
    Ms(int nl,String mz)throws YY{
        this.nl=nl;
        this.mz=mz;
        if (mz!="哈哈"){
            throw new YY("名字不能为哈哈");
        }
        System.out.println(nl+"---"+mz);
    }
}
class YY extends Exception{
    YY(String xx){
        System.out.println(xx);
        System.out.println("请改名字");
    }
}