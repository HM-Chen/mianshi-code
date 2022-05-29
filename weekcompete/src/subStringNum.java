import java.util.*;

public class subStringNum {
    public static void main(String[] args) {
        String s = "aaaa";
        String target = "a";
        int[] tar = new int[27];
        int cnt = 0;
        for(int i = 0; i < target.length(); i++){
            if(tar[target.charAt(i) - 'a'] == 0){
                cnt++;
            }
            tar[target.charAt(i) - 'a']++;
        }
        int ans = 0;
        for(int j = 0; j < s.length(); j++){
            tar[s.charAt(j) - 'a']--;
            if(tar[s.charAt(j) - 'a'] == 0){
                cnt--;
            }
            if(cnt == 0){
                ans++;
                for(int i = 0; i < target.length(); i++){
                    if(tar[target.charAt(i) - 'a'] == 0){
                        cnt++;
                    }
                    tar[target.charAt(i) - 'a']++;
                }
            }

        }
        System.out.println(ans);
    }
}
