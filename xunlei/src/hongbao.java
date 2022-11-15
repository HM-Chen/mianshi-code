import java.util.*;
public class hongbao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nums = in.nextLine().split(" ");
        int[] preSum = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += Integer.parseInt(nums[i]);
            preSum[i] = sum;
        }
        int res = 0;
        for(int i = 0; i < nums.length-2; i++){
            for(int j = 0; j < nums.length-i; j++){
                int num1 = preSum[i];
                int num2 = preSum[j]-num1;
                int num3 = preSum[nums.length-1] - num1 - num2;
                if(num1 <= num2 && num2 <= num3){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
