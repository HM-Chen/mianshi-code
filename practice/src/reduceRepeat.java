import java.util.*;

public class reduceRepeat {
    public static void main(String[] args){
        int[] nums = {0,1,2,2,3,0,4,2};
        int target = 2;
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(nums[i] == target){
                for(int j = len-1; j > i; j--){
                    if(nums[j] != target){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        int res = 0;
        for(int i = 0; i < len; i++){
            if(nums[i] == target){
                res = i;
                break;
            }
        }
        System.out.println(res);
    }
}
