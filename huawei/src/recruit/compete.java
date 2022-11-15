package recruit;
import java.util.*;
public class compete {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        System.out.println(b.show(c) + "-");
    }
    public static boolean isAdmin(String str){
        return str.toLowerCase() == "admin";
    }
}


class A{
    public String show(D d){ return ("AD");}
    public String show(A a){ return ("AA");}
}

class B extends A{
    public String show(B b){ return ("BB");}
    public String show(A a){ return ("BA");}
}

class C extends B{}
class D extends B{}