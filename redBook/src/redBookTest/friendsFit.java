package redBookTest;
import java.util.*;

public class friendsFit {
    private static List<Integer> ans;
    private static int max;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer>[] list = new List[n+1];
        for(int i = 1; i < n; i++){
            int temp = in.nextInt();
            if(list[i+1] == null){
                list[i+1] = new ArrayList<>();
            }
            if(list[temp] == null){
                list[temp] = new ArrayList<>();
            }
            list[i+1].add(temp);
            list[temp].add(i+1);
        }
        in.close();
        int start = 1;
        for(int j = 1; j <= n; j++){
            if(list[j].size() == 1){
                start = j;
            }
        }
        boolean[] flag = new boolean[n+1];
        dfs(flag, start, list, 1);
        System.out.println(max/2);
    }
    public static void dfs(boolean[] flag, int now, List<Integer>[] list, int count){
        if(flag[now]){
            max = count > max ? count : max;
            return;
        }
        flag[now] = true;
        for(int i = 0; i < list[now].size(); i++){
            int val = list[now].get(i);
            if(!flag[val]){
                count++;
            }
            dfs(flag, val, list, count);
            count--;
        }
    }
}
