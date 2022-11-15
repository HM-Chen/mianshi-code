import java.util.*;
public class threeString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = in.nextLine().split(",");
        in.close();
        double sum = 0;
        int len = strs[0].length();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < len; i++){
            if(strs[0].charAt(i) >= '0' && strs[0].charAt(i) <= '9'){
                sb.append(strs[0].charAt(i));
            }
        }
        sum += Double.parseDouble(sb.toString());
        sum += Double.parseDouble(strs[1]);
        sum += Double.parseDouble(strs[2]);
        System.out.println(sum);
    }
}
