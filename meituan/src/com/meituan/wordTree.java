package com.meituan;

//import java.util.*;
//public class wordTree {
//    private static Set<Character> set;
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = Integer.parseInt(in.nextLine());
//        String[] route = in.nextLine().split(" ");
//        String str = in.nextLine();
//        in.close();
//        List<List<Integer>> list = new ArrayList<List<Integer>>();
//        list.add(new ArrayList<>());
//        for(int i = 0; i < n-1; i++){
//            if(list.size() <= Integer.parseInt(route[i])){
//                list.add(new ArrayList<>());
//            }
//            list.get(Integer.parseInt(route[i])-1).add(i+1);
//        }
//        int[] ans = new int[n];
//        for(int j = 0; j < n; j++){
//            set = new HashSet<>();
//            dfs(list, str, j+1, set);
//            ans[j] = set.size();
//        }
//        for(int i = 0; i < n; i++){
//            System.out.print(ans[i] + " ");
//        }
//    }
//    public static void dfs(List<List<Integer>> list, String str, int start, Set<Character> set){
//        if(list.get(start) == null){
//            return;
//        }
//        set.add(str.charAt(start-1));
//        List<Integer> tmps = list.get(start);
//        for(int tmp : tmps){
//            dfs(list, str, tmp, set);
//        }
//    }
//}


import java.util.*;
public class wordTree {
    static String words;
    static int sum;
    static List<Integer> ans;
    private static Set<Character> set;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(i+1, new ArrayList<>());
        }
        for(int i = 1; i < n; i++){
            map.get(in.nextInt()).add(i+1);
        }
        in.nextLine();
        words = in.nextLine();
        in.close();
        ans = new ArrayList<>();
        sum = 0;
        for(int i = 1; i <= n; i++){
            dfs(map, i, new ArrayList<>(), i);
            System.out.print(ans.get(i-1));
        }
    }
    public static void dfs(Map<Integer, List<Integer>> map, int start, List<Character> count, int tar){
        List<Integer> list = map.get(start);
        char c = words.charAt(start-1);
        if(!count.contains(c)){
            count.add(c);
            sum++;
        }
        for(int r : list){
            dfs(map, r, count, tar);
        }
        if(start != tar){
            ans.add(sum);
            sum = 0;
        }
    }
}
