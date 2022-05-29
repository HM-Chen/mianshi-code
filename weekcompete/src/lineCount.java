import java.util.*;

public class lineCount {
    public static void main(String[] args) {
        int[][] stockPrices = {{1,1},{500000000,499999999},{1000000000,999999998}};
        int len = stockPrices.length;
        Arrays.sort(stockPrices, (a, b) -> a[0] - b[0]);
        int ans = 1;
        float dev = (float)(stockPrices[1][1] - stockPrices[0][1]) / (float)(stockPrices[1][0] - stockPrices[0][0]);
        for(int i = 2; i < len; i++){
            if((float)(stockPrices[i][1] - stockPrices[i-1][1]) / (float)(stockPrices[i][0] - stockPrices[i-1][0]) != dev){
                dev = (float)(stockPrices[i][1] - stockPrices[i-1][1]) / (float)(stockPrices[i][0] - stockPrices[i-1][0]);
                ans++;
            }
        }
        System.out.println(ans);
    }
}
