package recruit;
import java.util.*;
public class cutString {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for(int i = 0; i < n; i++){
            String str = in.nextLine();
            int count = 0;
            Stack<Character> stack = new Stack<>();
            for(int j = 0; j < str.length(); j++){
                if(stack.size() == 0 || stack.peek() != str.charAt(j)){
                    stack.push(str.charAt(j));
                }else if(stack.peek() == str.charAt(j)){
                    stack.pop();
                    count++;
                }
            }
            String ans = count % 2 == 0 ? "No" : "Yes";
            System.out.println(ans);
        }
        in.close();

    }

}
