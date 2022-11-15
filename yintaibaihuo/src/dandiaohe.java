import java.util.*;
public class dandiaohe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] nums = in.nextLine().split(" ");
        long ans = calSum(nums, n);
        System.out.println((int)ans);
    }
    public static long calSum(String[] nums, int n){
        if(n <= 0){
            return 0;
        }
        long sum = 0;
        for(int i = 0; i < n-1; i++){
            if(Long.parseLong(nums[i]) <= Long.parseLong(nums[n-1])){
                sum += Long.parseLong(nums[i]);
                sum %= (10e9+7);
            }
        }
        return sum + calSum(nums, n-1);
    }
}
