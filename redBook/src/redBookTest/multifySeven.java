package redBookTest;
import java.util.*;
public class multifySeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }
        in.close();
        int ans = 0;
        Arrays.sort(nums);
        int start = 0;
        int end = n;
        if(Math.abs(nums[0]) > Math.abs(nums[n-1])){
            ans = Math.abs(Math.abs(nums[0])-7);
            nums[0] = -7;
            start = 1;
        }else{
            ans = Math.abs(Math.abs(nums[n-1])-7);
            nums[n-1] = 7;
            end = n-1;
        }
        for(int i = start; i < end; i++){
            if(nums[i] < 0){
                ans += -1 - nums[i];
            }else if(nums[i] > 0){
                ans += nums[i] - 1;
            }
        }
        int mul = 1;
        List<Integer> zero = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                zero.add(i);
                continue;
            }
            mul *= nums[i];
        }

        if(zero.size() != 0){
            ans += zero.size();
        }else{
            if(mul == -7){
                ans += 2;
            }
        }
        System.out.println(ans);
    }
}
