import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class increaseSubnums {
    private static List<List<Integer>> ans;
    private static Set<List<Integer>> set;
    public static void main(String[] args) {
        int[] nums = {4,6,7,7};
        ans = new ArrayList<List<Integer>>();
        set = new HashSet<List<Integer>>();
        recurse(new ArrayList<>(), nums, 0);
        ans.addAll(set);
        System.out.println(ans);;
    }
    public static void recurse(List<Integer> list, int[] nums, int index){
        if(list.size() > 1){
            set.add(new ArrayList<>(list));
        }
        for(int i = index; i < nums.length; i++){
            if(list.size()  == 0 || nums[i] >= list.get(list.size()-1)){
                list.add(nums[i]);
                recurse(list, nums, i+1);
                list.remove(list.size()-1);
            }
        }
    }
}