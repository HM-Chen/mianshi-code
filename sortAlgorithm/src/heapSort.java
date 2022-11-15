import java.util.*;
public class heapSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int n = nums.length;
        for(int i = n/2-1; i >= 0; i--){
            sort(nums, i, n);
        }
        for(int i = n-1; i >= 0; i--){
            int tmp = nums[0];
            nums[0] = nums[i];
            nums[i] = tmp;
            sort(nums, 0, i);
        }
        System.out.println(nums);
    }
    public static void sort(int[] nums, int i, int n){
        int tmp = nums[i];
        for(int k = i*2+1; k < n; k = k*2+1){
            if(k+1 < n && nums[k+1] > nums[k]){
                k++;
            }
            if(nums[k] > nums[i]){
                nums[i] = nums[k];
                i = k;
            }else{
                break;
            }
            nums[i] = tmp;
        }
    }
}
