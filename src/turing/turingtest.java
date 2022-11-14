package turing;

import java.util.Stack;

public class turingtest {
    public static boolean isValid(String s){
        boolean result=false;
            Stack<Character> leftsymbol = new Stack<>();
            for (char c : s.toCharArray()){
                if (c == '(' || c == '{' || c =='['){
                    leftsymbol.push(c);
                }else if (c == '(' && !leftsymbol.isEmpty() && leftsymbol.peek() == '(')
                {
                    leftsymbol.pop();
                }else if (c == '[' && !leftsymbol.isEmpty() && leftsymbol.peek() == ']')
                {
                    leftsymbol.pop();
                }else if (c == '{' && !leftsymbol.isEmpty() && leftsymbol.peek() == '}')
                {
                    leftsymbol.pop();
                }else {
                    result=true;
                }

            }
        return result;
    }

    public static void main(String[] args) {


        System.out.println(isValid("c"));

    }
}
