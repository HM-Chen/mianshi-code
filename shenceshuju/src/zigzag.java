import java.util.*;

public class zigzag {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n == 1){
            System.out.print(in.nextInt());
        }else{
            int[][] nums = new int[n][n];
            for(int i = 0; i < n*n; i++){
                int r = i / n;
                int c = i % n;
                nums[r][c] = in.nextInt();
            }
            in.close();
            System.out.print(nums[0][0]);
            System.out.print(" ");
            print(nums,0,1);
        }
    }
    public static void print(int[][] nums, int r, int c){
        int n = nums.length;
        System.out.print(nums[r][c]);
        System.out.print(" ");
        if((r == 0 && c != 0) || (r != (n-1) && c == (n-1))){
            while(r != (n-1) && c != 0){
                r++;
                c--;
                System.out.print(nums[r][c]);
                System.out.print(" ");
            }
            if(r == (n-1)){
                print(nums, r, c+1);
            }else if(c == 0){
                print(nums, r+1, c);
            }
        }else if((c == 0 && r != 0) || (r == (n-1) && c != (n-1))){
            while(r != 0 && c != (n-1)){
                r--;
                c++;
                System.out.print(nums[r][c]);
                System.out.print(" ");
            }
            if(c == (n-1)){
                print(nums, r+1, c);
            }else if(r == 0){
                print(nums, r, c+1);
            }
        }
    }
}