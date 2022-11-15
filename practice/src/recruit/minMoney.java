package recruit;
import java.util.*;
public class minMoney {
    public static void main(String[] args) {
        int[] A = {4,13,6,14};
        int[] B = {28,11,20,8};
        int n = A.length;
        int[][] values = new int[n][2];
        for(int i = 0; i < n; i++){
            values[i][0] = A[i];
            values[i][1] = B[i];
        }
        Arrays.sort(values, (a, b) -> b[1] - a[1]);
        int ans = 0;
        boolean flagA = false;
        int i = 0;
        while(i <= n-3){
            int sumA = (int)Math.floor((values[i][0]+values[i+1][0]+values[i+2][0])*0.6);
            int sumB = values[i][1]+values[i+1][1];
            if(sumA <= sumB){
                ans += sumA;
                flagA = true;
            }else{
                ans += sumB;
            }
            i += 3;
        }
        for(; i < n; i++){
            if(values[i][0] <= values[i][1]){
                if(flagA){
                    ans += (int)Math.floor(values[i][0]*0.6);
                }else{
                    ans += values[i][0];
                }
            }else{
                ans += values[i][1];
            }
        }
        System.out.println(ans);
    }
}
