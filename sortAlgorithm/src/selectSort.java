public class selectSort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        int len = nums.length;
        for(int i = 0; i < len; i++){
            for(int j = i+1; j < len; j++){
                if(nums[j] < nums[i]){
                    int tmp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tmp;
                }
            }
        }
        System.out.println(nums);
    }
}
