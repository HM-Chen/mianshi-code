package com.meituan;
import java.util.*;

public class foods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String foodR = in.nextLine();
        String foodS = in.nextLine();
        in.close();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            sb.append(foodR.charAt(i)+"");
            sb.append(foodS.charAt(i)+"");
        }
        System.out.println(sb.toString());
    }
}
