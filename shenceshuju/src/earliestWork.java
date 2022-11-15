import java.util.*;

public class earliestWork {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] times = in.nextLine().split(" ");
        long[] nums = new long[n];
        for(int i = 0; i < n; i++){
            String[] time = times[i].split(":");
            long seconds = 0;
            if(time[0].charAt(0) != '0'){
                seconds += 3600 * Long.parseLong(time[0]);
            }else if(time[0].charAt(0) == '0' && time[0].charAt(1) != '0'){
                seconds += 3600 * Long.parseLong(time[0].substring(1));
            }
            if(time[1].charAt(0) != '0'){
                seconds += 60 * Long.parseLong(time[1]);
            }else if(time[1].charAt(0) == '0' && time[1].charAt(1) != '0'){
                seconds += 60 * Long.parseLong(time[1].substring(1));
            }
            if(time[2].charAt(0) != '0'){
                seconds += Long.parseLong(time[2]);
            }else if(time[2].charAt(0) == '0' && time[2].charAt(1) != '0'){
                seconds += Long.parseLong(time[2].substring(1));
            }
            nums[i] = seconds;
        }
        Arrays.sort(nums);
        long locate = nums[0];
        long max = Long.MIN_VALUE;
        for(int j = 1; j < n; j++){
            if(nums[j] - nums[j-1] > max){
                locate = nums[j-1];
                max = nums[j] - nums[j-1];
            }
        }
        if(24*3600 - nums[n-1] + nums[0] > max){
            locate = nums[n-1];
        }
        StringBuilder sb = new StringBuilder();
        if(locate / 3600 < 10){
            sb.append("0" + locate / 3600 + ":");
        }else{
            sb.append(locate / 3600 + ":");
        }
        if(locate / 3600 / 60 < 10){
            sb.append("0" + locate / 3600 / 60 + ":");
        }else{
            sb.append(locate / 3600 / 60 + ":");
        }
        if(locate % 60 < 10){
            sb.append("0" + locate % 60 + ":");
        }else{
            sb.append(locate % 60 + ":");
        }
        System.out.println(sb.toString().substring(0,sb.toString().length()-1));
    }
}
