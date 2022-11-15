package com.meituan;
import java.util.*;
public class titlePlan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];
        int[] nums3 = new int[n];
        for(int i = 0; i < n; i++){
            nums1[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++){
            nums2[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++){
            nums3[i] = in.nextInt();
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(nums2[j] > nums1[i] && nums2[j] <= 2*nums1[i]){
                    for(int k = 0; k < n; k++){
                        if(nums3[k] > nums2[j] && nums3[k] <= 2*nums2[j]){
                            ans++;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
