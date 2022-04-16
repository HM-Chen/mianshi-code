import java.util.*;

public class robot {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int N = in.nextInt();
            for(int i = 0; i < N; i++){
                int num = in.nextInt();
                int res = find(num);
                System.out.println(res);
            }

        }

    }
    public static int find(int num){
        int cnt = 0;
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                cnt++;
            }
        }
        return cnt+1;
    }
}
