

import java.util.*;

public class calculate {
    public static void main(String[] args){
//        String s = "3+2*2";
//        int len = s.length();
//        Deque<Integer> stack = new LinkedList<Integer>();
//        int num = 0;
//        char pre_char = '+';
//        for(int i = 0; i < len; i++){
//            if(Character.isDigit(s.charAt(i))){
//                num = num*10+(s.charAt(i)-'0');
//            }
//            if(!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == (len-1)){
//                switch (pre_char) {
//                    case '+':
//                        stack.push(num);
//                        break;
//                    case '-':
//                        stack.push(-num);
//                        break;
//                    case '*':
//                        stack.push(stack.pop() * num);
//                        break;
//                    case '/':
//                        stack.push(stack.pop() / num);
//                        break;
//                }
//                pre_char = s.charAt(i);
//                num = 0;
//            }
//        }
//        int res = 0;
//        while(!stack.isEmpty()){
//            res += stack.pop();
//        }
//        System.out.println(res);
        calculate c = new calculate();
        c.start();

    }
    public static void start(){
        int i = 5;
        Value v = new Value();
        v.i = 25;
        change(v,i);
        System.out.println(v.i);
    }
    public static void change(Value v, int i){
        i = 0;
        v.i = 20;
        Value val = new Value();
        v = val;
        System.out.println(v.i + " " + i);
    }
    static class Value{
        public int i = 15;
    }

}

