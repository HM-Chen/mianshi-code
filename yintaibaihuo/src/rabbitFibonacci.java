import java.util.*;
public class rabbitFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int ans = f(n);
        System.out.println(ans);
    }
    public static int f(int n){
        if(n == 1){
            return 2;
        }
        if(n == 2){
            return 3;
        }
        return f(n-1)+f(n-2);
    }
}
