package recruit;
import java.util.*;
public class maxLenSubstring {
    public static void main(String[] args) {
        String str = "pwwkew";
        int len = str.length();
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int start = 0, end = 0; end < len; end++){
            char c = str.charAt(end);
            if(map.containsKey(c)){
                start = Math.max(map.get(c), start);
            }
            ans = Math.max(end-start+1, ans);
            map.put(c, end+1);
        }
        System.out.println(ans);
    }
}
