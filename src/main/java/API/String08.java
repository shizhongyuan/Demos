package API;

/**
 * Created by Administrator on 2017/4/20 0020.
 */
public class String08 {
    public static void main(String[] args){         // 注int类型的
        System.out.println(Integer.parseInt("124")+9);   // 数的强转把字符124转为数字124 Integer.parseInt固定代码
        System.out.println(Integer.toBinaryString(90)); // 进制的转换  十转二
        System.out.println(Integer.toOctalString(90)); // 进制的转换  十转八
        System.out.println(Integer.toHexString(90)); // 进制的转换  十转十六
        System.out.println(Integer.toString(90,8)); // 进制的转换 前一个数为要转的数 后面数为转为的进制数
        System.out.println(Integer.parseInt("3c",16));// 进制的转换  把其它进制转为10进制
    }
}
