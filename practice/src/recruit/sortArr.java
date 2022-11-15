package recruit;
import java.util.*;

public class sortArr {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(String.valueOf(nums[i]).charAt(0) < String.valueOf(nums[j]).charAt(0)){
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
            }
        }
        System.out.println(nums);
    }
}
