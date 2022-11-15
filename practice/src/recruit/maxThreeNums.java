package recruit;
import java.util.*;
public class maxThreeNums {
    public static void main(String[] args) {
        int[] srcArr = {1,0,2,-1,-4,-2};
        int n = 3;
        int len = srcArr.length;
        int[][] nums = new int[len][2];
        for(int i = 0; i < len; i++){
            nums[i][0] = srcArr[i];
            nums[i][1] = i;
        }
        Arrays.sort(nums, (a,b) -> a[0] - b[0]);
        int sumP = 0;
        int[] P = new int[n];
        for(int i = 0; i < n-1; i++){
            P[i] = nums[i][1];
            for(int j = i+1; j < n; j++){
                sumP += nums[i][0] * nums[j][0];
            }
        }
        P[n-1] = nums[n-1][1];
        int sumN = 0;
        int[] N = new int[n];
        for(int i = len-1; i > len-n; i--){
            N[len-i-1] = nums[i][1];
            for(int j = i-1; j >= len-n; j--){
                sumN += nums[i][0] * nums[j][0];
            }
        }
        N[n-1] = nums[len-n][1];
        int[] locate = new int[n];
        if(sumP > sumN){
            locate =  P;
        }else{
            locate = N;
        }
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            ans[i] = srcArr[locate[i]];
        }
        System.out.println(Math.max(sumP, sumN));;
    }
}
