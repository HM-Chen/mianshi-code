package recruit;

import java.util.List;

public class zeroSubarray {
    private static int ans;
    private static long dv;
    public static void main(String[] args) {
        int[] nums = {5,2,3,50,4};
        int x = 2;
        dv = (long)Math.pow(10,2);
        ans = 0;

    }
    public static void dfs(int[] nums, int idx, long mul){
        if(mul % dv == 0){
            ans++;
        }
        for(int i = idx; i < nums.length; i++){
            mul *= nums[i];
            dfs(nums, i+1, mul);
            mul /= nums[i];
        }
    }
}
