public class bubleSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-1-i; j++){
                if(nums[j+1] < nums[j]){
                    int tmp = nums[j+1];
                     nums[j+1] = nums[j];
                     nums[j] = tmp;
                }
            }
        }
        System.out.println(nums);
    }
}
