import java.util.*;
public class recurseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        String s = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(s));
    }
}
