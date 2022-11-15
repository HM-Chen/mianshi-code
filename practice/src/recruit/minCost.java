package recruit;

public class minCost {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int x = 2, y = 2;
        int r = arr.length;
        int c = arr[0].length;
        int[][] dp = new int[r][c];
        dp[0][0] = arr[0][0];
        for(int i = 1; i < r; i++){
            dp[i][0] = dp[i-1][0] + arr[i][0];
        }
        for(int j = 1; j < c; j++){
            dp[0][j] = dp[0][j-1] + arr[0][j];
        }
        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= y; j++){
                dp[i][j] = arr[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
            }
        }
        System.out.println(dp[x][y]);
    }
}
