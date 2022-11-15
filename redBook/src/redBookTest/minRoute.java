package redBookTest;
import java.util.*;
public class minRoute {
    private static int min;
    private static int n;
    private static int m;
    private static int k;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        k = in.nextInt();
        int[] pre = new int[m];
        int[] next = new int[m];
        int[] money = new int[m];
        for(int i = 0;i < m; i++){
            pre[i] = in.nextInt();
        }
        for(int i = 0;i < m; i++){
            next[i] = in.nextInt();
        }
        for(int i = 0;i < m; i++){
            money[i] = in.nextInt();
        }
        in.close();
        Map<Integer, List<Integer>> map = new HashMap<>();
        boolean[] flag = new boolean[n+1];
        for(int i = 0; i < m; i++){
            if(map.get(pre[i]) == null){
                map.put(pre[i], new ArrayList<>());
                map.get(pre[i]).add(next[i]);
            }else{
                map.get(pre[i]).add(next[i]);
            }
            if(map.get(next[i]) == null){
                map.put(next[i], new ArrayList<>());
                map.get(next[i]).add(pre[i]);
            }else{
                map.get(pre[i]).add(pre[i]);
            }
        }

        min = 0;

    }
    public static void dfs(Map<Integer, List<Integer>> map, boolean[] flag, int locate, int moneySum, int routeSum){
        if(locate == n){
            min = Math.min(min, moneySum);
            return;
        }
        flag[locate] = true;
        if(map.get(locate) != null){
            List<Integer> list = map.get(locate);

        }
    }
}
