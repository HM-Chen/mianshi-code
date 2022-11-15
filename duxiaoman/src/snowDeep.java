import java.util.*;
public class snowDeep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int h = in.nextInt();
        int[][] nums = new int[n][2];
        for(int i = 0; i < n*2; i++){
            nums[i/2][i%2] = in.nextInt();
        }
        in.close();
        Arrays.sort(nums, (a, b) -> a[0] - b[0]);
        int min = nums[0][0];
        Arrays.sort(nums, (a, b) -> b[1] - a[1]);
        int max = nums[0][1];
        int[] count = new int[max - min];
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = nums[i][0]-min; j < nums[i][1]-min; j++){
                if(count[j] < h){
                    count[j]++;
                    if(count[j] == h) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}