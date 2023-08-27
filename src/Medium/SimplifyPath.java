package Medium;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/a/b/../c/";

        System.out.println(simplifyPath(path));
    }

    private static String simplifyPath(String path) {
        String s = "";
        path = path + "/";
        Stack<String> stack = new Stack<>();
        for (int i = 1; i < path.length(); i++) {
            if (path.charAt(i) == '/') {
                if (s.equals("..")) {
                    if (!stack.empty()) {
                        stack.pop();
                    }
                } else if (!s.equals(".") && !s.isEmpty()) {
                    stack.push(s);
                }
                s = "";
            } else {
                s = s + path.charAt(i);
            }
        }
        String res = "";
        while (!stack.empty()) {
            res = "/" + stack.pop() + res;
        }
        return res.isEmpty() ? "/" : res;
    }
}

/*
Steps:
1. Traverse the string character by character
2. If we come across '/' then we either push the string in stack or pop
3. To pop the stack, the string should be ".."
4. To push the stack, the string should be anything else apart from "." or ".."
5. We should concatenate character to string until we reach "/"
 */

