package Thegeneric01;

/**
 * Created by Administrator on 2017/5/6 0006.
 */
public class Zhu01 {
           public int age;
            public String naem; // private : 私有，只能在类内部使用,protected ： 类内部，相同的包，子类  ,public ： 所有地方

    public Zhu01(int age, String naem) {
        this.age = age;
        this.naem = naem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }
}
