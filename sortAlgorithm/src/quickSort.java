public class quickSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int len = nums.length;
        quickSort(nums, 0, len-1);
        System.out.println(nums);
    }
    public static void quickSort(int[] nums, int lo, int hi){
        if(lo >= hi){
            return;
        }
        int j = partition(nums, lo, hi);
        quickSort(nums, lo, j-1);
        quickSort(nums, j+1, hi);
    }
    public static int partition(int[] nums, int i, int j){
        int pivot = nums[i];
        int lo = i;
        while(i < j){
            while(i < j && nums[j] >= pivot){
                j--;
            }
            while(i < j && nums[i] <= pivot){
                i++;
            }
            if(i < j){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            }
        }
        nums[lo] = nums[j];
        nums[j] = pivot;
        return j;
    }
}
