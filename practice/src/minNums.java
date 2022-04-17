import java.util.*;

public class minNums {
    public static void main(String[] args){
        int[] misssions = {2,2,3,3,2,4,4,4,4,4};
//        int[] misssions = {2,3,3};
        int len = misssions.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++){
            map.put(misssions[i],map.getOrDefault(misssions[i],0)+1);
        }
        int res = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int count = 0;
            int num = entry.getValue();
            if(num < 2){
                res = -1;
                break;
            }
            while(num % 3 != 0){
                num -= 2;
                count += 1;
            }
            count += num / 3;
            res += count;
        }
        System.out.println(res);
    }
}
