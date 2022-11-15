import java.util.*;
public class changeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String t = in.nextLine();
        int n = s.length();
        int m = t.length();
        if(n * m == 0){
            System.out.println(n+m);
        }
        int[][] dp = new int[n+1][m+1];
        for(int i = 0; i < n+1; i++){
            dp[i][0] = i;
        }
        for(int j = 0; j < m+1; j++){
            dp[0][j] = j;
        }
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < m+1; j++){
                int left = dp[i-1][j]+1;
                int down = dp[i][j-1]+1;
                int left_down = dp[i-1][j-1];
                if(s.charAt(i-1) != t.charAt(j-1)){
                    left_down += 1;
                }
                dp[i][j] = Math.min(left, Math.min(down, left_down));
            }
        }
        System.out.println(dp[n][m]);
    }
}
