import java.util.*;
public class threeNodeTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nodes = in.nextLine().split(",");
        in.close();
        int n = nodes.length;
        if(nodes[0].equals("None")){
            System.out.println(0);
        }else{
            Queue<Integer> queue = new LinkedList<>();
            int ans = 0;
            int cnt = 1;
            queue.offer(0);
            while(!queue.isEmpty()){
                int size = queue.size();
                for(int i = 0; i < size; i++){
                    int tmp = queue.poll();
                    if(cnt % 2 == 1){
                        ans += Integer.parseInt(nodes[tmp]);
                    }
                    if(tmp*3+1 < n && !nodes[tmp*3+1].equals("None")){
                        queue.offer(tmp*3+1);
                    }
                    if(tmp*3+2 < n && !nodes[tmp*3+2].equals("None")){
                        queue.offer(tmp*3+2);
                    }
                    if(tmp*3+3 < n && !nodes[tmp*3+3].equals("None")){
                        queue.offer(tmp*3+3);
                    }
                }
                cnt++;
            }
            System.out.println(ans);
        }
    }
}
