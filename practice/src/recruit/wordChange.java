package recruit;
import java.util.*;
public class wordChange {
    public static void main(String[] args) {
        String str = "AbcD";
        str = change(str);
        System.out.println(str);
        System.out.println('0'+1);
    }
    public static String change(String str){
        StringBuilder s = new StringBuilder();
        int len = str.length();
        for(int i = 0; i < len; i++){
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122){
                s.append((char)(str.charAt(i)-32));
            }else{
                s.append((char)(str.charAt(i)+32));
            }
        }
        return s.toString();
    }
}
