import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        int left = 0;
        int right = 1;
        int sum = 0;
        while(right < n){
            sum = left + right;
            left = right;
            right = sum;
        }
        int res = Math.min(right - n, n - left);
        System.out.println(res);
    }
}
