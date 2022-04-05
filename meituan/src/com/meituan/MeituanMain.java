package com.meituan;
import java.util.*;

public class MeituanMain {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String flag = in.nextLine();
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i+flag.length(); j <= s.length(); j++){
                String subStr = s.substring(i,j);
                if(check(flag,subStr)){
                    sum += s.length() - j + 1;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
    public static boolean check(String flag, String subStr){
        int i = 0, j = 0;
        while(i < flag.length() && j < subStr.length()){
            if(flag.charAt(i) == subStr.charAt(j)){
                i++;
            }
            j++;
        }
        return i == flag.length();
    }
}
