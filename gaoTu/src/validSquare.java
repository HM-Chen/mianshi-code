import java.util.*;
public class validSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if(stack.size() == 0 || map.get(stack.peek()) == null || map.get(stack.peek()) != str.charAt(i)){
                stack.push(str.charAt(i));
            }else if(map.get(stack.peek()) == str.charAt(i)){
                stack.pop();
            }
        }
        System.out.println(stack.size() == 0);
    }
}
