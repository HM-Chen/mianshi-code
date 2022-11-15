package com.meituan;
import java.util.*;
public class maxGrades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] pis = new int[n];
        int[] grades = new int[n];
        for(int i = 0; i < n; i++){
            pis[i] = in.nextInt();
        }
        for(int i = 0; i < n; i++){
            grades[i] = in.nextInt();
        }
        float[] dif = new float[n];
        for(int i = 0; i < n; i++){
            dif[i] = grades[i] - grades[i] * pis[i] / 100f;
        }
        Arrays.sort(dif);
        double sumGrades = 0;
        for(int i = 0; i < n; i++){
            sumGrades += grades[i];
        }
        for(int i = 0; i < n-m; i++){
            sumGrades -= dif[i];
        }
        System.out.println(String.format("%.2f", sumGrades));
    }
}
