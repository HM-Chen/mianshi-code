import java.util.*;
public class divideValue {
    private static boolean find;
    private static boolean[] flag;
    public static void main(String[] args) {
        List<List<String>> equations = new ArrayList<List<String>>();
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        equations.add(list);
//        List<String> list1 = new ArrayList<>();
//        list1.add("b");
//        list1.add("d");
//        equations.add(list1);
        double[] values = {2.0,3.0};
        List<List<String>> queries = new ArrayList<List<String>>();
        List<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("c");
        queries.add(list2);
        double[] ans = new double[queries.size()];
        for(int i = 0; i < queries.size(); i++){
            flag = new boolean[equations.size()];
            find = false;
            double res = dfs(equations, values, queries.get(i).get(0), queries.get(i).get(1), 1.0);
            ans[i] = res > 0.0 ? res : -1.0;
        }
        System.out.println(ans);;
    }
    public static double dfs(List<List<String>> equations, double[] values, String left, String right, double res){
        for(int j = 0; j < equations.size(); j++){
            if(!flag[j]){
                if(equations.get(j).get(0).equals(left)){
                    res *= values[j];
                    flag[j] = true;
                    if(equations.get(j).get(0).equals(right)){
                        return 1.0;
                    }
                    if(equations.get(j).get(1).equals(right)){
                        find = true;
                        break;
                    }
                    if(!find){
                        res = dfs(equations, values, equations.get(j).get(1), right, res);
                    }
                }else if(equations.get(j).get(1).equals(left)){
                    res *= 1.0 / values[j];
                    flag[j] = true;
                    if(equations.get(j).get(1).equals(right)){
                        return 1.0;
                    }else if(equations.get(j).get(0).equals(right)){
                        find = true;
                    }
                    if(!find){
                        res = dfs(equations, values, equations.get(j).get(0), right, res);
                        break;
                    }
                }
            }
        }
        if(!find){
            res *= -1.0;
            find = true;
        }
        return res;
    }
}
