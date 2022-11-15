import java.util.*;
public class convolutionNeuralNets {
    private static int midR;
    private static int midC;
    private static int M;
    private static int N;
    private static int K;
    private static int L;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        M = in.nextInt();
        N = in.nextInt();
        K = in.nextInt();
        L = in.nextInt();
        int[][] picture = new int[M][N];
        int[][] kernal = new int[K][L];
        for(int i = 0; i < M*N; i++){
            picture[i/N][i%N] = in.nextInt();
        }
        for(int i = 0; i < K*L; i++){
            kernal[i/L][i%L] = in.nextInt();
        }
        in.close();
        midR = K / 2;
        midC = L / 2;
        int[][] ans = new int[M][N];
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                ans[i][j] = calculate(picture, kernal, i, j);
            }
        }
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println("");
        }
    }
    public static int calculate(int[][] picture, int[][] kernal, int i, int j){
        int left = j > midC ? midC : j;
        int up = i > midR ? midR : i;
        int right = N-j-1 > L-midC-1 ? L-midC-1 : N-j-1;
        int down = M-i-1 > K-midR-1 ? K-midR-1 : M-i-1;
        int ans = 0;
        for(int r = i-up; r <= i+down; r++){
            for(int c = j-left; c <= j+right; c++){
                ans += picture[r][c]*kernal[r-i+midR][c-j+midC];
            }
        }
        if(ans > 255){
            return 255;
        }else if(ans < 0){
            return 0;
        }
        return ans;
    }
}
