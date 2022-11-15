package com.meituan;
import java.util.*;

public class maxMoney {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] money = new int[n];
        for(int i = 0; i < n; i++){
            money[i] = in.nextInt();
        }
        in.close();
        int[] sum = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        sum[0] = money[0];
        while(!queue.isEmpty()){
            int index = queue.poll();
            if(index*2+1 < n){
                queue.offer(index*2+1);
                sum[index*2+1] = sum[index] + money[index*2+1];
            }
            if(index*2+2 < n){
                queue.offer(index*2+2);
                sum[index*2+2] = sum[index] + money[index*2+2];
            }
        }
        int max = 0;
        for(int num : sum){
            max = num > max ? num : max;
        }
        System.out.println(max);
    }
}
