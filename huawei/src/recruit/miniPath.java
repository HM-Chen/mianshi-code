package recruit;
import java.util.*;
public class miniPath {
    private static int min;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int[][] room = new int[r][c];
        boolean[][] flag = new boolean[r][c];
        int startI = 0;
        int startJ = 0;
        for(int i = 0; i < r*c; i++){
            room[i/c][i%c] = in.nextInt();
            if(room[i/c][i%c] == 1){
                flag[i/c][i%c] = true;
            }
            if(room[i/c][i%c] == 2){
                startI = i/c;
                startJ = i%c;
            }
        }
        in.close();
        min = Integer.MAX_VALUE;
        dfs(room, flag, startI, startJ, 0);
        System.out.println(min);
    }
    public static void dfs(int[][] room, boolean[][] flag, int r, int c, int count){
        if(flag[r][c]){
            return;
        }
        flag[r][c] = true;
        if(room[r][c] == 3){
            min = Math.min(min, count);
        }else if(room[r][c] == 4){
            count += 3;
        }else if(room[r][c] == 6){
            if(r+1 < room.length && room[r+1][c] == 1){
                room[r+1][c] = 0;
                flag[r+1][c] = false;
            }
            if(r-1 >= 0 && room[r-1][c] == 1){
                room[r-1][c] = 0;
                flag[r-1][c] = false;
            }
            if(c+1 < room[0].length && room[r][c+1] == 1){
                room[r][c+1] = 0;
                flag[r][c+1] = false;
            }
            if(c-1 >= 0 && room[r][c-1] == 1){
                room[r][c-1] = 0;
                flag[r][c-1] = false;
            }
            count++;
        }else{
            count++;
        }


        if(r+1 < room.length){
            dfs(room, flag, r+1, c, count);
        }
        if(r-1 >= 0){
            dfs(room, flag, r-1, c, count);
        }
        if(c+1 < room[0].length){
            dfs(room, flag, r, c+1, count);
        }
        if(c-1 >= 0){
            dfs(room, flag, r, c-1, count);
        }
    }
}
