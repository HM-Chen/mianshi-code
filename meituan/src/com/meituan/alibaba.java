package com.meituan;
import java.util.*;

public class alibaba {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int len = str.length();
        int max_nums = 2;
        int[] nums = new int[len];
        for(int i = 0; i < len; i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                nums[i] = str.charAt(i) - '0';
            }else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'F'){
                nums[i] = str.charAt(i) - 'A';
            }
            max_nums = Math.max(max_nums,nums[i]);
        }
        for(int j = max_nums+1; j <= 16; j++){
            int res = 0;
            for(int k = 0; k < len; k++){
                res += Math.pow(j,len-1-k);
            }
            System.out.println(res);
        }
    }
}
