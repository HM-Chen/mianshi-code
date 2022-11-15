import java.util.*;
public class answerEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        long[][] nums = new long[t][2];
        for(int i = 0; i < t; i++){
            nums[i][0] = Long.parseLong(in.nextLine());
            nums[i][1] = i;
        }
        in.close();
        long[][] ans = new long[t][2];
        Arrays.sort(nums, (a, b) -> (int)(a[0] - b[0]));
        for(int i = 0; i < t; i++){
            ans[i][1] = nums[i][1];
            if(i == 0){
                for(long j = 1; j <= nums[i][0]; j++){
                    ans[i][0] += j / f(j);
                }
            }else{
                ans[i][0] = ans[i-1][0];
                for(long j = nums[i-1][0]+1; j <= nums[i][0]; j++){
                    ans[i][0] += j / f(j);
                }
            }
        }
        Arrays.sort(ans, (a, b) -> (int)(a[1] - b[1]));
        for(int i = 0; i < t; i++){
            System.out.println(ans[i][0]);
        }
    }
    public static long f(long num){
        long ans = 0;
        for(int i = 0; i < 31; i++){
            long check = (long)Math.pow(2, i);
            ans = check & num;
            if(ans != 0){
                break;
            }
        }
        return ans;
    }
}
