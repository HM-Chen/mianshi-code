public class healSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int n = nums.length;
        for(int h = n/2; h > 0; h /= 2){
            for(int i = h; i < n; i++){
                for(int j = i; j >= h && nums[j] < nums[j-h]; j -= h){
                    int tmp = nums[j];
                    nums[j] = nums[j-h];
                    nums[j-h] = tmp;
                }
            }
        }
        System.out.println(nums);
    }
}
