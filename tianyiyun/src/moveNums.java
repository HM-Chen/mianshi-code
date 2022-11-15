import java.util.*;
public class moveNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] nums = in.nextLine().split(",");
        int ji = 0;
        int ou = 0;
        for(int i = 0; i < n; i++){
            if(Integer.parseInt(nums[i]) % 2 == 0){
                ou++;
            }else{
                ji++;
            }
        }
        int l = 0, r = ou;
        String[] ans = new String[n];
        for(int i = 0; i < n; i++){
            if(Integer.parseInt(nums[i]) % 2 == 0){
                ans[l++] = nums[i];
            }else{
                ans[r++] = nums[i];
            }
        }
        for(int i = 0; i < n-1; i++){
            System.out.print(ans[i] + ",");
        }
        System.out.print(ans[n-1]);
    }
}
