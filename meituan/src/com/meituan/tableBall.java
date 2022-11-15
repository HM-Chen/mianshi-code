package com.meituan;
import java.util.*;
public class tableBall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();
        int ans = Math.max(11-a, b+2-a);
        System.out.println(ans);
    }
}
