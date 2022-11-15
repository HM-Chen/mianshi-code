import java.util.*;
public class imageTangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int t = 0; t < T; t++){
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] nums = new int[n][m];
            for(int i = 0; i < n*m; i++){
                nums[i/m][i%m] = in.nextInt();
            }

        }
    }
}
