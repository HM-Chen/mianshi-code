import java.util.*;

public class testSystem {
    public static void main(String[] args) {
        String a = "150.01";
        String b = "1500.1";
        System.out.println(criterion_compare(a,b));
    }
    public static String criterion_compare(String result, String expect){
        int len1 = result.length();
        int len2 = expect.length();
        if(len1 != len2){
            int i = 0, j = 0;
            while(i < len1 && j < len2){
                if(result.charAt(i) == expect.charAt(j)){
                    i++;
                    j++;
                }else if(result.charAt(i) < '0' || result.charAt(i) > '9'){
                    i++;
                }else if(expect.charAt(j) < '0' || expect.charAt(j) > '9'){
                    j++;
                }
            }
            if(i < len1 && (result.charAt(i) > '9' || result.charAt(i) < '0')){
                return "Presentation error";
            }else if(j < len2 && (expect.charAt(j) > '9' || expect.charAt(j) < '0')){
                return "Presentation error";
            }else if(i == len1 && j == len2){
                return "Presentation error";
            }else{
                return "wrong Answer";
            }
        }
        int m = 0, n = 0;
        while(m < len1 && n < len2){
            if(result.charAt(m) != expect.charAt(n)){
                return "wrong Answer";
            }
            m++;
            n++;
        }
        return "Accept";
    }
}
