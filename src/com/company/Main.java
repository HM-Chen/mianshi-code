package com.company;
import java.util.*;



// We have imported the necessary tool classes.
// If you need to import additional packages or classes, please import here.

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tvl = scanner.nextLine();  // tvl报文字符串
        int n = scanner.nextInt();  // 需要匹配的tag个数n
        int[] tag_array = new int[n];
        for (int i = 0; i < n; i++) {
            tag_array[i] = scanner.nextInt();
        }
        int deviation = 2;
        for (int i = 0; i < tag_array.length; i++) {
            if(tvl.length() >= 4){
                int tag = Integer.parseInt(tvl.substring(0,2),16);
                int length = Integer.parseInt(tvl.substring(2,4),16);
                if(tvl.length() >= 4+length*2){
                    if(tag == tag_array[i]){ //如果匹配成功
                        System.out.println(length + " " + deviation);
                        deviation = deviation + length + 2;
                        tvl = tvl.substring(4+length*2);
                    }
                    else{
                        System.out.println(0 + " " + 0);
                    }

                }
                else  //丢弃消息
                    break;
            }

            else  //结束
                break;
        }

    }
}

