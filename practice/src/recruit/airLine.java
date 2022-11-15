package recruit;
import java.util.*;
public class airLine {
    private static int min;
    private static int n;
    public static void main(String[] args) {
        int[][] arr = {{0,8,1,10},{-1,0,-1,5},{-1,2,0,4},{-1,-1,-1,0}};
        n = arr.length;
        min = Integer.MAX_VALUE;
        boolean[] flag = new boolean[n];
        flag[0] = true;
        dfs(arr, flag, 0, 0);
        System.out.println(min);
    }
    public static void dfs(int[][] arr, boolean[] flag, int sum, int idx){
        if(idx == n-1){
            min = Math.min(min, sum);
            return;
        }
        for(int i = 0; i < n; i++){
            if(!flag[i] && arr[idx][i] > 0){
                flag[i] = true;
                sum += arr[idx][i];
                dfs(arr, flag, sum, i);
                flag[i] = false;
                sum -= arr[idx][i];
            }
        }
    }
}
