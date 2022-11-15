package com.meituan;

import com.sun.javafx.image.IntPixelGetter;

import java.util.*;
public class money {
    static List<Integer> ans;
    static int n;
    static int m;
    static int k;
    static int[] a;
    static int[] b;
    static int[] c;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = Integer.parseInt(in.nextLine());
        m = Integer.parseInt(in.nextLine());
        k = Integer.parseInt(in.nextLine());
        a = new int[n];
        b = new int[n];
        c = new int[n];
        for(int i = 0; i < m; i++){
            c[i] = in.nextInt();
        }
        for(int i = 0; i < m; i++){
            a[i] = in.nextInt();
        }
        for(int i = 0; i < m; i++){
            b[i] = in.nextInt();
        }
        in.close();
        ans = new ArrayList<>();
        dfs(0,0,k);
        Collections.sort(ans);
        System.out.println(ans.get(ans.get(ans.size()-1)));
    }
    public static void dfs(int day, int sum, int loc){
        if(day >= m){
            ans.add(sum);
            return;
        }
        dfs(day+1,sum+(loc==c[day] ? a[day] : b[day]), c[day]);
        dfs(day+1,sum,loc);
    }
}
