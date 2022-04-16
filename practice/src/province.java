import java.util.*;

public class province {
    public static void main(String[] args){
        int[][] connectedCity = {{1,1,0},{1,1,0},{0,0,1}};
        int cities = connectedCity.length;
        int provinces = 0;
        boolean[] visited = new boolean[cities];
        for(int i = 0; i < cities; i++){
            if(!visited[i]){
                dfs(i,cities,connectedCity,visited);
                provinces++;
            }
        }
        System.out.println(provinces);
    }
    public static void dfs(int i,int cities, int[][] connectedCity, boolean[] visited){
        for(int j = 0; j < cities; j++) {
            if (connectedCity[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(j, cities, connectedCity, visited);
            }
        }
    }
}
