import java.util.*;
import java.util.regex.Pattern;

public class fitString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String pattern = in.nextLine();
        in.close();
        System.out.println(Pattern.matches(pattern, str));
    }
}
