package recruit;
import java.util.*;
public class numSplit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0; i < n; i++){
            int cur = in.nextInt();
            max = Math.max(max, cur);
            map.put(cur,map.getOrDefault(cur,0)+1);
        }
        in.close();
        int ans = n - map.get(max);
        System.out.println(ans);
    }
}
