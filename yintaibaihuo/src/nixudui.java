import java.util.*;
public class nixudui {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] nums = in.nextLine().split(" ");
        System.out.println(getSmallSum(nums, n));
    }
    public static int getSmallSum(String[] nums, int n){
        if(n == 0){
            return 0;
        }
        return mergeSortRecursion(nums, 0, n-1);
    }
    public static int mergeSortRecursion(String[] nums, int l, int r){
        if(l == r){
            return 0;
        }
        int mid = (l+r)/2;
        return mergeSortRecursion(nums, l, mid) + mergeSortRecursion(nums, mid+1, r) + merge(nums, l, mid, r);
    }
    public static int merge(String[] nums, int left, int mid, int right){
        String[] temp = new String[right - left + 1];
        int index = 0;
        int i = left;
        int j = mid + 1;
        int smallSum = 0;
        while(i <= mid && j <= right){
            if(Long.parseLong(nums[i]) < Long.parseLong(nums[j])){
                smallSum += (Long.parseLong(nums[i])*(right-j+1)) % (10e9+7);
                temp[index++] = nums[i++];
            }else{
                temp[index++] = nums[j++];
            }
        }
        while(i <= mid){
            temp[index++] = nums[i++];
        }
        while(j <= right){
            temp[index++] = nums[j++];
        }
        for(int k = 0; k < temp.length; k++){
            nums[left++] = temp[k];
        }
        return smallSum;
    }
}
