package easy;

import java.util.Stack;

public class DuplicateInString {
    public static void main(String[] args) {
        String s = "abbaca";
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        for(int i = 1; i<s.length(); ++i) {
            char ch = s.charAt(i);
            if(!stack.isEmpty() && stack.peek()==ch ) {
                stack.pop();
            }
            else {
                stack.push(ch);
            }
            //System.out.println(stack.toString());
        }
        StringBuilder sb = new StringBuilder();
        stack.forEach(sb::append);;
        System.out.println(sb.toString());
    }
}
