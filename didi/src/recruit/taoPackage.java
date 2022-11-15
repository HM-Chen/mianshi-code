package recruit;
import java.util.*;
public class taoPackage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] weights = new int[n];
        long sum = 0;
        for(int i = 0; i < n; i++){
            weights[i] = in.nextInt();
            sum += weights[i];
        }
        in.close();
        Arrays.sort(weights);
        int max = n;
        int j = n-1;
        while(sum*k < weights[j]*max){
            sum -= weights[j];
            max--;
            j--;
        }
        System.out.println(max);
    }
}
