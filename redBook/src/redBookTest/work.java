package redBookTest;
import java.util.*;

public class work {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int id = in.nextInt();
        int[][] grades = new int[n][2];
        int sumI = 0;
        for(int i = 1; i <= n*m; i++){
            sumI += in.nextInt();
            if(i % m == 0){
                grades[i/m-1][0] = i/m;
                grades[i/m-1][1] = sumI;
                sumI = 0;
            }
        }
        in.close();
        Arrays.sort(grades, (a, b) -> b[1] - a[1]);
        for(int i = 0; i < n; i++){
            if(grades[i][0] == id){
                System.out.println(i+1);
            }
        }
    }
}
