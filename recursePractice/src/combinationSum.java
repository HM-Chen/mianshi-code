import java.util.*;
public class combinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        recurse(candidates, res, new ArrayList<>(), 0, 0, target);
        System.out.println(res);
    }
    public static void recurse(int[] candidates, List<List<Integer>> res, List<Integer> list, int sum, int index, int target){
        if(sum == target){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int j = index; j < candidates.length; j++){
            sum += candidates[j];
            if(sum <= target) {
                list.add(candidates[j]);
                recurse(candidates, res, list, sum, j, target);
                sum -= candidates[j];
                list.remove(list.size()-1);
            }else{
                break;
            }
        }
    }
}
