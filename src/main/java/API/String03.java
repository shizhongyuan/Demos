package API;

/**
 * Created by Administrator on 2017/4/16 0016.
 */
public class String03 {
    public static void main(String[] args){
       String03();
    }
    public static void String03(){
        String s = "小妹,旺财,小石";
        String [] arr= s.split(",");        //  split 固定代码 表示在那个位置切
        for (int x=0;x<arr.length;x++){
            System.out.println(arr[x]);
        }
        char[] xx = s.toCharArray();            // toCharArray()为固定代码 表示上面的方法输出时竖着排
        for (int y=0;y<xx.length;y++){
            System.out.println(xx[y]);
        }
        System.out.println("Acs".toLowerCase());   //  大写转小写
        System.out.println("Axs".toUpperCase());   // 小写转大写
        System.out.println("java".replace('a','p'));        // 已知数转为指定数 注如果已知数转换里面没有则不转换
        System.out.println("=="+"    a dk   j      ".trim()+"==");      // 去掉2端字符串的空格
        System.out.println("小".concat("妹"));  // 将字符串链接一起
    }
}
