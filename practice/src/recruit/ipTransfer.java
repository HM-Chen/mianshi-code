package recruit;

import java.util.Stack;

public class ipTransfer {
    public static void main(String[] args) {
        String ip = "10.13.0.6";
        String[] strs = ip.split("\\.");
        long ans = 0;
        for(int i = 0; i < strs.length; i++){
            ans += Math.pow(256, strs.length-i-1)*Integer.parseInt(strs[i]);
        }
        System.out.println(ans);
    }
}
