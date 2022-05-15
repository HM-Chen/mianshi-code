import java.util.*;

public class deleteString {
    public static void main(String[] args) {
        String[] words = {"abba","baba","bbaa","cd","cd"};
        List<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            list.add(words[i]);
        }
        for(int j = 0; j < list.size(); j++){
            while(j+1 < list.size() && check(list.get(j),list.get(j+1))){
                list.remove(j+1);
            }
        }
        System.out.println(list);
    }
    public static boolean check(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        int[] a1 = new int[27];
        for(int i = 0; i < a.length(); i++){
            a1[a.charAt(i) - 'a']++;
        }
        for(int j = 0; j < b.length(); j++){
            a1[b.charAt(j) - 'a']--;
        }
        for(int k = 0; k < 27; k++){
            if(a1[k] != 0){
                return false;
            }
        }
        return true;
    }
}
