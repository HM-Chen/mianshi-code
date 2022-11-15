package recruit;

import java.util.*;
public class maxLenSubserial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int left = 0, right = 0;
        Set<Character> set = new HashSet<>();
        Deque<Character> queue = new LinkedList<>();
        int len = 0;
        String ans = "";
        while(right < str.length()){
            if(set.size() < 3 || !set.add(str.charAt(right))){
                set.add(str.charAt(right));
                queue.offer(str.charAt(right));
                right++;
            }else if(right - left >= len){
                if(right - left > len){
                    ans = str.substring(left, right);
                }
                len = right - left;
                char tmp = queue.poll();
                while(queue.peek() == tmp){
                    queue.poll();
                    left++;
                }
                left++;
                set.remove(tmp);
            }
        }
        if(right - left > len){
            ans = str.substring(left, right);
        }
        System.out.println(ans);
    }
}
