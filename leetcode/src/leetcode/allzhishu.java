package leetcode;
import java.util.*;

public class allzhishu {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[] pre = new boolean[n];
        int count = 0;
        for(int i = 2; i < n; i++){
            if(!pre[i]){
                count++;
                for(int j = i*i; j < n; j += i){
                    pre[j] = true;
                }
            }
        }
        System.out.println(count);
    }
}
