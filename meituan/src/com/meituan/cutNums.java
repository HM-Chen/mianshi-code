package com.meituan;
import java.util.*;
public class cutNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] lens = in.nextLine().split(" ");
        String origin = in.nextLine();
        String[] subNums = in.nextLine().split(" ");
        String[] subStrings = new String[Integer.parseInt(lens[1])];
        for(int i = 0; i < Integer.parseInt(lens[1]); i++){
            subStrings[i] = in.nextLine();
        }
        in.close();
        int ans = 0;
    }
}
