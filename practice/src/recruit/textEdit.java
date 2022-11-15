package recruit;
import java.util.*;
public class textEdit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        long len = str.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < len){
            if(str.charAt(i) == '\\'){
                if(str.charAt(i+1) == '\\'){
                    sb.append('\\');
                    i += 2;
                }else if(i+10 <= len && str.substring(i+1, i+10).matches("delete{[0-9]}")){

                }
            }else {
                sb.append(str.charAt(i));
                i++;
            }
        }
    }
}
