package recruit;
import java.util.*;
public class exceptionSpeed {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int[] start = new int[n];
//        int[] end = new int[n];
//        for(int i = 0; i < n; i++){
//            start[i] = in.nextInt();
//        }
//        for(int i = 0; i < n; i++){
//            end[i] = in.nextInt();
//        }
//        int ans = 0;
//        boolean flag = false;
//        int cut = 0;
//        for(int i = n-1; i >= 0; i--){
//            for(int j = 0; j < n; j++){
//                if(start[i] == end[j]){
//                    if(j < i){
//                        ans++;
//                        flag = true;
//                        cut = j;
//                    }
//                    break;
//                }
//            }
//            if(flag){
//                for(int k = cut; k < n-1; k++){
//                    if(end[k] == end[k+1]){
//                        break;
//                    }
//                    end[k] = end[k+1];
//                }
//                flag = false;
//            }
//        }
//        System.out.println(ans);
        int x = 5;
        x *= x+=x%=2;
        System.out.println(x);
    }
}
