import java.util.*;
public class changeJuZhen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] nums = new int[n][n];
        for(int i = 0; i < n*n; i++){
            nums[i/n][i%n] = in.nextInt();
        }
        in.close();
        if(n == 1){
            System.out.println(0);
        }else {
            int ans = 0;
            for(int i = 1; i < n; i++){
                for(int j = 0; j < i; j++){
                    ans += Math.abs(nums[i][j] - nums[j][i]);
                }
            }
            System.out.println(ans*2);
        }

    }
}
