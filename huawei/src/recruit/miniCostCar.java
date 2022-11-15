package recruit;
import java.util.*;
public class miniCostCar {
    public static void main(String[] args) {
        int[][] arr = {{4,8,6},{6,13,8}};
        int r = arr.length;
        int c = arr[0].length;
        int ans = 0;
        for(int i = 0; i < r; i++){
            int min = Integer.MAX_VALUE;
            int locate = -1;
            for(int j = 0; j < c; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                    locate = j;
                }
            }
            ans += min;
            if(i < r-1){
                arr[i+1][locate] = Integer.MAX_VALUE;
            }
        }
        System.out.println(ans);
    }
}
