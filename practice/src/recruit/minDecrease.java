package recruit;
public class minDecrease {
    public static void main(String[] args) {
        int N = 3223;
        System.out.println(wqe(N));
    }

    //将数字变成 数组 便于处理
    private static int wqe(int n) {
        String m = Integer.toString(n);
        String[] l = m.split("");
        if (n > 1) {
            return qqq(del(m.length(), l.length, l));
        }
        return 1;
    }

    //递归数组 直到第i位比第i-1位大
    private static String[] del(int k, int k2, String[] l) {
        for (int i = 0; i < k - 1; i++) {
            if (Integer.valueOf(l[i]) < Integer.valueOf(l[i + 1])) {
                l[i] = Integer.toString(Integer.valueOf(l[i]) + 1);
                for (;i + 1 < k2;i++) {
                    l[i + 1] = Integer.toString(0);
                }
                del(k, k2, l);
            }
        }
        return l;
    }

    //将数组转变为 数字
    private static int qqq(String[] l) {
        StringBuilder result = new StringBuilder();
        for (String s : l) {
            result.append(s);
        }
        return Integer.valueOf(result.toString());
    }
}
