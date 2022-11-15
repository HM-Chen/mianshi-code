import java.util.*;
public class test {
    public static void main(String[] args) {
        Son son = new Son();
        change(son);
        System.out.println(son.a);

        String str = "123";
        switch (str){
            case "123":
                System.out.println("数字");
                break;
            case "abc":
                System.out.println("字母");
                break;
        }
    }
    public static void change(Son son){
        son.a = 4;
    }

}
class Father{
    static{
        System.out.println("父类静态方法");
    }
    public Father(){
        System.out.println("父类构造器");
    }

}
class Son extends Father{
    public int a;
    static{
        System.out.println("子类静态方法");
    }
    public Son(){
        a = 0;
        System.out.println("子类构造器");
    }

}