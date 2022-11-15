package recruit;
import java.util.*;
public class changeWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] S = in.nextLine().toCharArray();
        char[] T = in.nextLine().toCharArray();
        in.close();
        int lens = S.length;
        int lent = T.length;
        int[] count = new int[27];
        for(char t : T){
            count[t-'a']++;
        }
        int index = 0;
        while(index <= lens){
            int end = index+lent;
            if(end > lens){
                break;
            }
            List<Integer> list = new ArrayList<>();
            int[] tmpCount = count;
            for(int i = index; i < end; i++){
                if(S[i] == '#'){
                    list.add(i);
                }else{
                    tmpCount[S[i]-'a']--;
                }
            }
            index += lent;
            for(int locate : list){
                for(int k = 26; k >= 0; k--){
                    if(tmpCount[k] > 0){
                        S[locate] = (char)(k+'a');
                        tmpCount[k]--;
                    }
                }
            }
        }
        String ans = S.toString();
        System.out.println(ans);
    }
}
