import java.util.*;

public class deleteChar {
    public static void main(String[] args) {
        String number = "133235";
        char digit = '3';
        int len = number.length();
        StringBuilder sb = new StringBuilder(number);
        int flag = 0;
        int locate = -1;
        for(int i = 0; i < len; i++){
            if(i < len-1){
                if(number.charAt(i) == digit && number.charAt(i+1) > number.charAt(i)){
                    flag = 1;
                    sb.deleteCharAt(i);
                    break;
                }else if(number.charAt(i) == digit && number.charAt(i+1) <= number.charAt(i)){
                    locate = i;
                }
            }else if(number.charAt(i) == digit){
                flag = 1;
                sb.deleteCharAt(i);
            }

        }
        if(flag == 0){
            sb.deleteCharAt(locate);
        }
        System.out.println(sb.toString());
    }

}
