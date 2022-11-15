package com.meituan;
import java.util.*;
public class review {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] str1 = in.nextLine().split(" ");
        String[] str2 = in.nextLine().split(" ");
        String[] str3 = in.nextLine().split(" ");
        String[] str4 = in.nextLine().split(" ");
        int[] pos1 = new int[]{Integer.parseInt(str1[0]),Integer.parseInt(str1[1])};
        int[] pos2 = new int[]{Integer.parseInt(str2[0]),Integer.parseInt(str2[1])};
        int[] pos3 = new int[]{Integer.parseInt(str3[0]),Integer.parseInt(str3[1])};
        int[] dis = new int[]{Integer.parseInt(str4[0]),Integer.parseInt(str4[1]),Integer.parseInt(str4[2])};
        int[] res = null;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                int p1 = Math.abs(i-pos1[0])+Math.abs(j-pos1[1]);
                int p2 = Math.abs(i-pos2[0])+Math.abs(j-pos2[1]);
                int p3 = Math.abs(i-pos3[0])+Math.abs(j-pos3[1]);
                if(p1 == dis[0] && p2 == dis[1] && p3 == dis[2]){
                    res = new int[]{i, j};
                }
            }
            if(res != null){
                break;
            }
        }
        System.out.println(res[0] + " " + res[1]);
    }
}
