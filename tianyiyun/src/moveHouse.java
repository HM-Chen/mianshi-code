import java.util.*;
public class moveHouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int energy = in.nextInt();
        int n = in.nextInt();
        int[] values = new int[n];
        int[] costs = new int[n];
        for(int i = 0; i < n; i++){
            values[i] = in.nextInt();
        }
        n = in.nextInt();
        for(int i = 0; i < n; i++){
            costs[i] = in.nextInt();
        }
        in.close();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = values[i];
            arr[i][1] = costs[i];
        }
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        int ans = 0;
        int j = 0;
        while(energy > 0){
            energy -= arr[j][1];
            ans += arr[j][0];
            j++;
        }
        System.out.println(ans);
    }
}
