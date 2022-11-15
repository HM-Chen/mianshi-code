package com.meituan;
import java.util.*;
public class fantasticString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] lens = in.nextLine().split(" ");
        String a = in.nextLine();
        String b = in.nextLine();
        in.close();
        int n = Integer.parseInt(lens[0]);
        int m = Integer.parseInt(lens[1]);
        int  count = 0;
        for(int i = 0; i <= n-m; i++){
            if(check(a.substring(i, i+m), b)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean check(String a, String b){
        int len = b.length();
        for(int i = 0; i < len; i++){
            if(b.charAt(i) == '*' || a.charAt(i) == b.charAt(i)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
