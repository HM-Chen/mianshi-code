import java.util.*;
public class newNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = Long.parseLong(in.nextLine());
        String[] nums = in.nextLine().split(" ");
        Arrays.sort(nums, (a, b) -> (int)(Long.parseLong(b) - Long.parseLong(a)));
        String[] three = {nums[0], nums[1], nums[2]};
        Arrays.sort(three, (a, b) -> b.charAt(0) - a.charAt(0));
        System.out.println(three[0]+three[1]+three[2]);
    }
}
