import java.util.*;

public class mininumAverage {
    public static void main(String[] args) {
        int[] nums = {2,5,3,9,5,3};
        int position = 0;
        int mininum = Integer.MAX_VALUE;
        int len = nums.length;
        long[] sums = new long[len+1];
        for(int i = 1; i <= len; i++){
            sums[i] = nums[i-1] + sums[i-1];
        }
        for(int j = 1; j <= len; j++){
            if(calculate(sums,j) < mininum){
                mininum = calculate(sums,j);
                position = j-1;
            }
        }
        System.out.println(position);
    }
    public static int calculate(long[] sums, int locate){
        int len = sums.length;
        long average2 = 0;
        if(len-locate-1 != 0) {
            average2 = (long)(sums[len-1]-sums[locate]) / (len - locate - 1);
        }
        return (int)Math.abs(sums[locate]/locate - average2);
    }
}
