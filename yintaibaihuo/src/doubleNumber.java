import java.util.*;
public class doubleNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        in.close();
        Arrays.sort(nums);
        boolean flag = true;
        for(int i = 0; i < n-1; i++){
            while(nums[i] < nums[i+1]){
                nums[i] *= 2;
            }
            if(nums[i] > nums[i+1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
