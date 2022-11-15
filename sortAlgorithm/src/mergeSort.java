public class mergeSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int len = nums.length;
        mergeSort(nums, 0, len-1);
        System.out.println(nums);
    }
    public static void mergeSort(int[] nums, int lo, int hi){
        if(lo >= hi){
            return;
        }
        int mid = lo + (hi - lo)/2;
        mergeSort(nums, lo, mid);
        mergeSort(nums, mid+1, hi);
        merge(nums, lo, mid, hi);
    }
    public static void merge(int[] nums, int lo, int mid, int hi) {
        int[] result = new int[nums.length];
        int k = lo, i = lo, j = mid + 1;
        while (i <= mid && j <= hi) {
            if (nums[i] < nums[j]) {
                result[k++] = nums[i++];
            } else {
                result[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            result[k++] = nums[i++];
        }
        while (j <= hi) {
            result[k++] = nums[j++];
        }
        for (int m = lo; m <= hi; m++) {
            nums[m] = result[m];
        }
    }
}
