package com.meituan;
import java.util.*;
public class zhubao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] ops = new int[m];
        for(int i = 0; i < m; i++){
            ops[i] = in.nextInt();
        }
        in.close();
        Set<Integer> set = new HashSet<>();
        for(int j = m-1; j >= 0; j--){
            set.add(ops[j]);
        }
        for(int c = m-1; c >= 0; c--){
            System.out.print(ops[c]);
            System.out.print(" ");
        }
        for(int k = 1; k <= n; k++){
            if(set.add(k)){
                System.out.print(k);
                System.out.print(" ");
            }
        }
    }
}
