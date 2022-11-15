import java.util.*;
public class insertSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int len = nums.length;
        for(int i = 0; i < len; i++){
            for(int j = i; j > 0; j--){
                if(nums[j] < nums[j-1]){
                    int tmp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = tmp;
                }
            }
        }
        System.out.println(nums);
    }
}
