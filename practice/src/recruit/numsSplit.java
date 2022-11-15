package recruit;
import java.util.*;
public class numsSplit{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = Integer.parseInt(in.nextLine());
        in.close();
        int l = 0;
        int r = 0;
        for(int i = num/2; i >= 1; i--){
            if(check(i) && check(num-i)){
                l = i;
                r = num-i;
                break;
            }
        }
        System.out.println(l);
        System.out.println(r);
    }
    public static boolean check(int i){
        for(int j = 2; j <= Math.sqrt(i); j++){
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
}
