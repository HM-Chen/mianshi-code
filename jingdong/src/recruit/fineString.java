package recruit;
import java.util.*;
public class fineString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        char[] flag = {'r', 'e', 'd'};
        int ans = 0;
//        while(!check(str)){
        StringBuilder sb = new StringBuilder(" ");
        for(int j = 0; j < str.length(); j++){
            String pre = sb.toString();
            if(str.charAt(j) == pre.charAt(pre.length()-1)){
                ans++;
                sb = new StringBuilder(pre.substring(0, pre.length()-1));
                for(char c : flag){
                    if(c != pre.charAt(pre.length()-1) && j < str.length()-1 && c != str.charAt(j+1)){
                        sb.append(c);
                    }
                }
            }else{
                sb.append(str.charAt(j));
            }
        }
        str = sb.toString().substring(1);
//        }
        System.out.println(ans);
    }
    public static boolean check(String str){
        int len = str.length();
        if(len == 1){
            return true;
        }else{
            for(int j = 1; j < len; j++){
                if(str.charAt(j) == str.charAt(j-1)){
                    return false;
                }
            }
        }
        return true;
    }
}
