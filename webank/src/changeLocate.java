import java.util.*;
public class changeLocate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[][] nums = new int[t][2];
        for(int i = 0; i < t*2; i++){
            nums[i/2][i%2] = in.nextInt();
        }
        in.close();
        for(int i = 0; i < t; i++){
            int a = Math.max(nums[i][0], nums[i][1]);
            int b = Math.min(nums[i][0], nums[i][1]);
            if(a % b != 0){
                System.out.println(-1);
                continue;
            }
            int c = a / b;
            if(c % 2 != 0){
                System.out.println(-1);
                continue;
            }
            int step = 0;
            while(c >= 8){
                c /= 8;
                step++;
            }
            while(c >= 4){
                c /= 4;
                step++;
            }
            while(c >= 2){
                c /= 2;
                step++;
            }
            if(c % 2 != 1){
                System.out.println(-1);
            }else{
                System.out.println(step);
            }
        }
    }
}
