import java.nio.charset.StandardCharsets;
import java.util.*;
public class reverseInt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in.close();
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        byte temporary;
        for (int i = 0; i < bytes.length / 2; i += 2) {
            temporary = bytes[bytes.length - i - 2];
            bytes[bytes.length - i - 2] = bytes[i];
            bytes[i] = temporary;
            temporary = bytes[bytes.length - i - 1];
            bytes[bytes.length - i - 1] = bytes[i + 1];
            bytes[i + 1] = temporary;
        }
        System.out.println(new String(bytes));
    }
}
