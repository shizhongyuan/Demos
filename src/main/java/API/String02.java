package API;

/**
 * Created by Administrator on 2017/4/16 0016.
 */
public class String02 {
    public static void main(String[] args){
        String();
    }
    public static void String(){
            String s = "acdaefgh";
        System.out.println("字符串长度:"+s.length());    // length()固定代码
        System.out.println("字符串查找位置:"+s.charAt(3));     // charAt()固定代码
        System.out.println("字符串位置在哪:"+s.indexOf('g'));    //  indexOf()固定代码
        System.out.println("字符串中有相同的数的第2个数位置:"+s.lastIndexOf('a'));   //  lastIndexOf()固定代码
        System.out.println("字符串中想调取的数注后-1头不变:"+s.substring(2,5));       //  substring()固定代码
    }
}
