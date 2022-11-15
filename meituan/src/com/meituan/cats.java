package com.meituan;
import java.util.*;
public class cats {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums = in.nextInt();
        int T = in.nextInt();
        int[][] toys = new int[nums+1][3];
        for(int i = 1; i <= nums; i++){
            toys[i][0] = i;
            toys[i][1] = in.nextInt();
        }
        Arrays.sort(toys, (a, b) -> a[1] - b[1]);
        int[] things = new int[n];
        for(int i = 0; i < n; i++){
            things[i] = in.nextInt();
        }
        in.close();
        int ans = 0;
        for(int j = 0; j < n; j++){
            if(things[j] == 0){
                boolean flag = false;
                for(int k = 1; k < nums+1; k++){
                    if(toys[k][2] > 0){
                        toys[k][2]--;
                        ans += toys[k][1];
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    ans += T;
                }
            }else{
                for(int k = 1; k < nums+1; k++){
                    if(toys[k][0] == things[j]){
                        toys[k][2]++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
