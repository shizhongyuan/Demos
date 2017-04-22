package API;

/**
 * Created by Administrator on 2017/4/16 0016.
 */
public class String04 {
    public static void main(String[] args){
        String04();
    }
    public static void String04(){
        String s = "a,b,n,m,h";
        System.out.println(s.equals("a,b,n,m,H"));          // 判断是否相同 equals固定代码
        System.out.println(s.equalsIgnoreCase("a,b,n,m,H"));  // 判断是否相同忽略大小写 equalsIgnoreCase 固定代码
        System.out.println(s.contains("n,m"));          // 是否包含打印的字符串
        System.out.println("a".compareTo("m"));         // 判断2个字符串的大小 如为负后大 正前大
    }
}
