import java.util.*;

public class reconstructString {
    public static void main(String[] args) {
        String str = "anniversary3 10th2 Tuhu5 The1 of4";
        String[] strs = str.split(" ");
        int n = strs.length;
        String[] ans = new String[n];
        for(int i = 0; i < n; i++){
            int index = strs[i].charAt(strs[i].length()-1)-'0';
            ans[index-1] = strs[i].substring(0, strs[i].length()-1);
        }
        StringBuilder sb = new StringBuilder();
        for(String an : ans){
            sb.append(an);
            sb.append(" ");
        }
        Arrays.sort(strs);
        System.out.println(sb.toString().substring(0, sb.toString().length()-1));
    }
}
