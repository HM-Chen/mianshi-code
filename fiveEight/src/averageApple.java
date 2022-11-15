import java.util.*;
public class averageApple {
    public static int n;
    public static int sum;
    public static boolean flag;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        sum = 0;
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
            sum += nums[i];
        }
        flag = false;
        if(sum % 2 == 1){
            System.out.println(0);
        }else{
            dfs(nums, 0, 0);
            if(flag){
                System.out.println(sum/2);
            }else{
                System.out.println(0);
            }
        }
    }
    public static void dfs(int[] nums, int idx, int count){
        if(count == sum/2){
            flag = true;
            return;
        }
        if(flag || idx == n){
            return;
        }
        for(int i = idx; i < n; i++){
            count += nums[i];
            dfs(nums, i+1,count);
            count -= nums[i];
        }
    }
}
