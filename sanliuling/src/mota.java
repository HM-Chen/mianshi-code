import java.util.*;
public class mota {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n*2; i++){
            arr[i/2][i%2] = in.nextInt();
        }
        in.close();
        int max = 0;
        List<int[]> list = new ArrayList<int[]>();
        for(int j = 0; j < n; j++){
            if(arr[j][1] == 0){
                max += arr[j][0];
            }else{
                list.add(arr[j]);
            }
        }
        int[][] arrBao = new int[list.size()][2];
        for(int k = 0; k < list.size(); k++){
            arrBao[k] = list.get(k);
        }
        Arrays.sort(arrBao, (a, b) -> b[0] - a[0]);
        for(int i = 0; i < list.size(); i++){
            max = Math.max(2*max, max+arrBao[i][0]);
        }
        System.out.println(max);
    }
}
