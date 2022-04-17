import java.util.*;

public class findString {
    public static void main(String[] args){
        String s = "123123";
        int k = 2;
        int len = s.length();
        if(len <= k){
            System.out.println(s);;
        }
        String str = s;
        while(str.length() > k){
            len = str.length();
            int n = 0;
            int num = len / k;
            if(len % k == 0){
                n = num;
            }else{
                n = num + 1;
            }
            String res = "";
            for(int i = 0; i < n-1; i++){
                String sub = str.substring(i*k,(i+1)*k);
                int sum = 0;
                for(int j = 0; j < sub.length(); j++){
                    sum += sub.charAt(j) - '0';
                }
                res += sum;
            }
            String sub = str.substring((n-1)*k);
            int sum = 0;
            for(int j = 0; j < sub.length(); j++){
                sum += sub.charAt(j) - '0';
            }
            res += sum;
            str = res;
        }
        System.out.println(str);;
    }
}
