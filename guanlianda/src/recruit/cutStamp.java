package recruit;
import java.util.*;
public class cutStamp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        in.close();
        if(k < 2){
            System.out.println(0);
        }else if(k == 2){
            int ans = Math.min(n, m);
            ans *= ans;
            System.out.println(ans);
        }else if(k-1 <= Math.min(n, m)){
            int ans = Math.min(n, m);
            ans *= ans;
            ans += k-2;
            System.out.println(ans);
        }
    }
}
