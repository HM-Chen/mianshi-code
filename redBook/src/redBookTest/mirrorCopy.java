package redBookTest;
import java.util.*;
public class mirrorCopy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long k = (long) in.nextInt();
        int[] nums = new int[n];
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            nums[i] = in.nextInt();
            list.add(nums[i]);
        }
        in.close();
        for(int i = n-1; i >= 0; i--){
            list.add(nums[i]);
        }
        int index = (int)(k % (n*2))-1;
        System.out.println(list.get(index));
    }
}
