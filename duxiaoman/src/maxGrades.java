import java.util.*;
public class maxGrades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[] strs = new String[n];
        for(int i = 0; i < n; i++){
            strs[i] = in.nextLine();
        }
        in.close();
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans = Math.max(ans, grade(strs[i]));
        }
        System.out.println(ans);
    }
    public static int grade(String str){
        int[] words = new int[26];
        for(int i = 0; i < str.length(); i++){
            words[str.charAt(i)-'a']++;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 26; i++){
            max = Math.max(max, words[i]);
            if(words[i] != 0){
                min = Math.min(min, words[i]);
            }
        }
        return max - min;
    }
}
