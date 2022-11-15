package recruit;
import java.util.*;
public class finetuneArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for(int i = 0; i < t; i++){
            String[] count = in.nextLine().split(" ");
            int n = Integer.parseInt(count[0]);
            int k = Integer.parseInt(count[1]);
            int x = Integer.parseInt(count[2]);
            String[] nums = in.nextLine().split(" ");
            int[] preSum = new int[n];
            preSum[0] = Integer.parseInt(nums[0]);
            for(int j = 1; j < n; j++){
                preSum[j] = preSum[j-1] + Integer.parseInt(nums[j]);
            }

        }
        in.close();
    }
}
