package recruit;
import java.util.*;
public class baiduSubString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        long len = str.length();
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        int ans = 0;
        int i = 0;
        while(i <= len - 5){
            if(!list.contains(str.charAt(i))){
                Set<Character> set = new HashSet<>();
                set.add(str.charAt(i));
                if(!list.contains(str.charAt(i+1)) || !set.add(str.charAt(i+1))){
                    continue;
                }
                if(!list.contains(str.charAt(i+2)) || !set.add(str.charAt(i+2))){
                    continue;
                }
                if(list.contains(str.charAt(i+3)) || !set.add(str.charAt(i+3))){
                    continue;
                }
                if(!list.contains(str.charAt(i+4)) || !set.add(str.charAt(i+4))){
                    continue;
                }
                ans++;
                i += 3;
            }else{
                i++;
            }
        }
        System.out.println(ans);
    }
}
