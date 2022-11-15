import java.util.*;
public class linesMaxLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        String[][] lines = new String[n][2];
        for(int i = 0; i < n; i++){
            lines[i] = in.nextLine().split(",");
        }
        in.close();
        Arrays.sort(lines, (a, b) -> (int)(Long.parseLong(a[0]) - Long.parseLong(b[0])));
        long ans = 0;
        String[] check = lines[0];
        for(int i = 1; i < n; i++){
            if(Long.parseLong(lines[i][0]) >= Long.parseLong(check[1])){
                ans += Long.parseLong(check[1]) - Long.parseLong(check[0]);
                check = lines[i];
            }else if(Long.parseLong(lines[i][0]) <= Long.parseLong(check[1]) && Long.parseLong(lines[i][0]) >= Long.parseLong(check[0])){
                ans += Long.parseLong(lines[i][0]) - Long.parseLong(check[0]);
                if(Long.parseLong(lines[i][1]) > Long.parseLong(check[1])){
                    check[0] = check[1];
                    check[1] = lines[i][1];
                }else{
                    check[0] = lines[i][1];
                }
            }else if(Long.parseLong(lines[i][1]) >= Long.parseLong(check[1])){
                check[0] = check[1];
                check[1] = lines[i][1];
            }else if(Long.parseLong(lines[i][1]) < Long.parseLong(check[1]) && Long.parseLong(lines[i][1]) >= Long.parseLong(check[0])){
                check[0] = lines[i][1];
            }
        }
        ans += Long.parseLong(check[1]) - Long.parseLong(check[0]);
        System.out.println(ans);
    }
}
