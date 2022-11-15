import java.util.*;
public class phoneNumber {
    public static void main(String[] args) {
        String str1 = "13";
        String str2 = "123";
        System.out.println(str2.contains(str1));
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(in.nextLine());
            String[] phones = new String[n];
            for(int j = 0; j < n; j++){
               phones[j] = in.nextLine();
            }
            Arrays.sort(phones, (a, b) -> a.length() - b.length());
            boolean flag = false;
            for(int k = 0; k < n-1; k++){
                for(int l = k+1; l < n; l++){
                    if(phones[l].substring(0, phones[k].length()).equals(phones[k])){
                        flag = true;
                        break;
                    }
                }
                if(flag){
                    break;
                }
            }
            if(flag){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        in.close();
    }
}
