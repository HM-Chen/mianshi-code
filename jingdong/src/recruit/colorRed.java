package recruit;
import java.util.*;
public class colorRed {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int dCount = 0;
        int sCount = 0;
        long ans = 0;
        for(int i = 0; i < n; i++){
            if(in.nextInt() % 2 == 0){
                dCount++;
            }else{
                sCount++;
            }
        }
        if(dCount >= 2){
            ans += calculate(dCount);
        }
        if(sCount >= 2){
            ans += calculate(sCount);
        }
        System.out.println(ans%(Math.pow(10,7)+7));
    }
    public static long calculate(int count){
        long ans = 0;
        for(int i = 2; i <= count; i++){
            int up = 1;
            int down = 1;
            for(int j = 1; j <= i; j++){
                up *= (count-j+1);
                down *= j;
            }
            ans += (up/down);
        }
        return ans;
    }
}
