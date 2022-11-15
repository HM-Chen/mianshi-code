import java.util.*;
public class maxLenword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        int Y = 0;
        int F = 0;
        for(int i = 0; i < str.length(); i++){
            if(list.contains(str.charAt(i))){
                Y++;
            }else{
                F++;
            }
        }
        int ans = 0;
        if(Y >= F-1){
            ans = Y + F;
        }else{
            ans = Y*2+1;
        }
        System.out.println(ans);
    }
}
