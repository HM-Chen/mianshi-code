import java.util.*;
public class integerGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nums = in.nextLine().split(",");
        int target = Integer.parseInt(nums[0]);
        int maxDoubles = Integer.parseInt(nums[1]);
        int ans = 0;
        while(target > 1){
            if(maxDoubles > 0 && target % 2 == 0){
                target /= 2;
//                max
                ans++;
            }else{
                target--;
                ans++;
            }
        }
        System.out.println(ans);
    }
}
