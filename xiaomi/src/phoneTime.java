import java.util.*;
public class phoneTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String[]> list = new ArrayList<>();
        while(true){
            String str = in.nextLine();
            if(str.equals("")){
                break;
            }
            list.add(str.split(" "));
        }
        String[][] times = new String[list.size()][2];
        for(int i = 0; i < list.size(); i++){
            times[i] = list.get(i);
        }
        Arrays.sort(times, (a, b) -> Integer.parseInt(a[0]) - Integer.parseInt(b[0]));
        int left = Integer.parseInt(times[0][0]);
        int right = Integer.parseInt(times[0][1]);
        int ans = 0;
        for(int j = 1; j < list.size(); j++){
            if(Integer.parseInt(times[j][0]) > right){
                ans += (right - left);
                left = Integer.parseInt(times[j][0]);
                right = Integer.parseInt(times[j][1]);
            }else if(Integer.parseInt(times[j][1]) > right){
                right = Integer.parseInt(times[j][1]);
            }
        }
        ans += (right - left);
        System.out.println(ans);
    }
}
