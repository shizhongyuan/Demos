package API;

/**
 * Created by Administrator on 2017/4/19 0019.
 */
public class String06 {
    public static void main(String[] args){
        String qdao="   as v - - d   ";     // 去掉字串的前后空格
        qdao = nba(qdao);
        System.out.println("-"+qdao+"-");
    }
    public static String nba(String qdao){
        int x=0,y=qdao.length()-1;
        while (x<=y && qdao.charAt(x)==' '){
            x++;
        }
        while (x<=y && qdao.charAt(y)==' '){
            y--;
        }
        return qdao.substring(x,y+1);
    }
}
