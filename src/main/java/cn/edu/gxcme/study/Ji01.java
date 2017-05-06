package cn.edu.gxcme.study;

/**
 * Created by Administrator on 2017/4/8 0008.
 */
/*
需求：
一百块钱买一百只鸡
公鸡5块钱一只    x表示
母鸡3块钱一只    y表示
小鸡1块钱3只     z表示
*/
public class Ji01 {
    public static void main(String[] args){
    ji();
    }
    static void ji(){
        for (int x=0;x<=100;x++){
        for (int y=0;y<=100;y++){
            for (double z=0;z<=100;z++){
                if ((x+y+z==100) && (x*5+y*3+z/3==100)){
        System.out.println("公鸡="+x+"----"+"母鸡"+y+"----"+"小鸡"+z);
                }
              }
            }
        }
    }
}
