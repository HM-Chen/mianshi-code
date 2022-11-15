package recruit;
import java.util.*;
public class testStatic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        int len = str.length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len-1; i++){
            if(i == 0){
                if(str.charAt(0) == '?'){
                    if(len == 1 || (len > 1 && str.charAt(1) != '1')){
                        sb.append(1);
                    }else{
                        sb.append(2);
                    }
                }else{
                    sb.append(str.charAt(0));
                }
            }else{
                if(str.charAt(i) == '?'){
                    for(int j = 0; j <= 3; j++){
                        if('0'+j != str.charAt(i-1) && '0'+j != str.charAt(i+1)){
                            sb.append((char)('0'+j));
                            break;
                        }
                    }
                }else{
                    sb.append(str.charAt(i));
                }
            }
        }
        if(len-2 >= 0 && str.charAt(len-1) == '?'){
            if(str.charAt(len-2) > '0'){
                sb.append(0);
            }else{
                sb.append(1);
            }
        }
        long ans = Long.parseLong(sb.toString());
        while(ans % 3 != 0){
            ans++;
        }
        System.out.println(ans);
    }
}
