public class oils {
    public static void main(String[] args) {
        int[] oils = {1,2,5};
        int box = 11;
        int n = oils.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(oils[j] > oils[i]){
                    int tmp = oils[j];
                    oils[j] = oils[i];
                    oils[i] = tmp;
                }

            }
        }
        int ans = 0;
        int k = 0;
        while(k < n){
            if(box >= oils[k]){
                box -= oils[k];
                ans++;
            }else{
                k++;
            }
            if(box == 0){
                break;
            }
        }
        ans = box == 0 ? ans : -1;
        System.out.println(ans);
    }
}
