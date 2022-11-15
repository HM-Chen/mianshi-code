package recruit;
import java.util.*;
public class basketball {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] power = new int[n];
        for(int i = 0; i < n; i++){
            power[i] = in.nextInt();
        }
        in.close();
        boolean[] flag = new boolean[n];
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = power[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> b[0] - a[0]);
        char[] ans = new char[n];
        int handleNum = 0;
        for(int i = 0; i < n; i++){
            if(!flag[arr[i][1]]){
                flag[arr[i][1]] = true;
                if(handleNum % 2 == 0){
                    ans[arr[i][1]] = 'A';
                    int count = m;
                    int idx = arr[i][1]+1;
                    while(count > 0 && idx < n){
                        if(!flag[idx]){
                            flag[idx] = true;
                            count--;
                            ans[idx] = 'A';
                        }
                        idx++;
                    }
                    count = m;
                    idx = arr[i][1]-1;
                    while(count > 0 && idx >= 0){
                        if(!flag[idx]){
                            flag[idx] = true;
                            count--;
                            ans[idx] = 'A';
                        }
                        idx--;
                    }
                }else{
                    ans[arr[i][1]] = 'B';
                    int count = m;
                    int idx = arr[i][1]+1;
                    while(count > 0 && idx < n){
                        if(!flag[idx]){
                            flag[idx] = true;
                            count--;
                            ans[idx] = 'B';
                        }
                        idx++;
                    }
                    count = m;
                    idx = arr[i][1]-1;
                    while(count > 0 && idx >= 0){
                        if(!flag[idx]){
                            flag[idx] = true;
                            count--;
                            ans[idx] = 'B';
                        }
                        idx--;
                    }
                }
                handleNum++;
            }
        }
        for(char c : ans){
            System.out.print(c);
        }
    }
}
