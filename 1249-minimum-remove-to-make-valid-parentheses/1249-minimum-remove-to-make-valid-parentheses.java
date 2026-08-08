import java.util.*;

class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder str = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (stack.isEmpty())
                    str.setCharAt(i, '#');
                else
                    stack.pop();
            }
        }

        while (!stack.isEmpty()) {
            str.setCharAt(stack.pop(), '#');
        }

        return str.toString().replace("#", "");
    }
}