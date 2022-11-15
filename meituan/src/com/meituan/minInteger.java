package com.meituan;
import java.util.*;
public class minInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(in.nextInt());
        }
        in.close();
        int[] ans = new int[n];
        for(int j = 0; j < n; j++){
            int moveNum = list.get(j);
            list.remove(j);
            int k = 0;
            while(list.contains(k)){
                k++;
            }
            ans[j] = k;
            list.add(j,moveNum);
        }
        for(int i = 0; i < n; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
