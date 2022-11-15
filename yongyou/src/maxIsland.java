import java.util.*;
public class maxIsland {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String[]> list = new ArrayList<String[]>();
        while(in.hasNext()){
            String str = in.nextLine();
            list.add(str.split(","));
        }
        String[][] islands = new String[list.size()][];
        for(int i = 0; i < list.size(); i++){
            islands[i] = list.get(i);
        }
        int r = islands.length;
        int c = islands[0].length;
        int ans = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(islands[i][j].equals("1")){
                    ans = Math.max(ans, dfs(islands, i, j));
                }
            }
        }
        System.out.println(ans);
    }
    public static int dfs(String[][] islands, int i, int j){
        if(i < 0 || j < 0 || i == islands.length || j == islands[0].length || islands[i][j].equals("0")){
            return 0;
        }
        islands[i][j] = "0";
        int[] di = {0,0,1,-1};
        int[] dj = {1,-1,0,0};
        int ans = 1;
        for(int index = 0; index != 4; ++index){
            ans += dfs(islands, i+di[index], j+dj[index]);
        }
        return ans;
    }
}
