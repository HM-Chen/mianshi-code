package redBookTest;
import java.util.*;

public class magic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] counts = in.nextLine().split(" ");
        String[] energy = in.nextLine().split(" ");
        in.close();
        int n = Integer.parseInt(counts[0]);
        long k = Long.parseLong(counts[1]);
        int ans = 0;
        long[] nums = new long[n];
        for(int i = 0; i < n; i++){
            nums[i] = Long.parseLong(energy[i]);
        }
        Arrays.sort(nums);
        for(int i = n-1; i > 0; i--){
            if(nums[i] < Math.sqrt(k)){
                break;
            }else if(nums[i] == Math.sqrt(k)) {
                for (int j = i - 1; j >= 0; j--) {
                    if (nums[j] == Math.sqrt(k)) {
                        ans++;
                    }else{
                        break;
                    }
                }
            }else{
                for(int j = i-1; j >= 0; j--){
                    if(nums[j] * nums[i] >= k){
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans*2);
    }
}
