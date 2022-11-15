package com.meituan;
import java.util.*;
public class greatWall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
        }
        int dMax = 0;
        for(int i = 0; i < n; i += 2){
            dMax = nums[i] > dMax ? nums[i] : dMax;
        }
        int sMax = 0;
        for(int i = 1; i < n; i += 2){
            sMax = nums[i] > sMax ? nums[i] : sMax;
        }
        long ans = 0;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                ans += dMax - nums[i];
            }else{
                ans += sMax - nums[i];
            }
        }
        if(dMax == sMax){
            ans += n/2;
        }
        System.out.println(ans);
    }
}
