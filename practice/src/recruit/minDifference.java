package recruit;

public class minDifference {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,8};
        int k = 2;
        int len = arr.length;
        int sum = 0;
        for(int i = 0; i < len; i++){
            sum += arr[i];
        }
        int[][] dp = new int[len+1][sum/(k+1)+1];
        for(int i = 1; i <= len; i++){
            for(int j = 1; j <= sum/(k+1); j++){
                if(j >= arr[i-1]){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-arr[i-1]]+arr[i-1]);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(sum - (k+1)*dp[len][sum/(k+1)]);
    }
}
