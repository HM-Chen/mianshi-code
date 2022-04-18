import java.util.*;

public class StrongPassword {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String password = in.nextLine();
        int len = password.length();
        int num_count = 0, sword_count = 0, bword_count = 0;
        int res = 0;
        int same_count = 1;
        int div_count = 0;
        for(int i = 0; i < len; i++){
            if(password.charAt(i) >= '0' && password.charAt(i) <= '9'){
                num_count++;
            }else if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z'){
                sword_count++;
            }else if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'){
                bword_count++;
            }
            if(i >= 1 && password.charAt(i) == password.charAt(i-1)){
                same_count++;
            }else{
                if(same_count >= 3){
                    if(same_count % 2 == 0){
                        div_count += same_count/2 - 1;
                    }else{
                        div_count += same_count/2;
                    }
                }
                same_count = 1;
            }
        }
        if(same_count >= 3){
            if(same_count % 2 == 0){
                div_count += same_count/2 - 1;
            }else{
                div_count += same_count/2;
            }
        }
        if(num_count > 1){
            num_count = 1;
        }
        if(sword_count > 1){
            sword_count = 1;
        }
        if(bword_count > 1){
            bword_count = 1;
        }
        if(len >= 6){
            res = Math.max(3 - (num_count + sword_count + bword_count), div_count);
        }else{
            res = Math.max(Math.max(6-len,3 - (num_count + sword_count + bword_count)), div_count);
        }
        System.out.println(res);
    }
}
