import java.util.*;

class Solution {

    public static String infixToPostfix(String s) {

        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }

            else if (ch == '(') {
                st.push(ch);
            }

            else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    sb.append(st.pop());
                }
                st.pop();
            }

            else {

                while (!st.isEmpty() && st.peek() != '(' &&
                       ((ch == '+' || ch == '-') ||
                       ((ch == '*' || ch == '/') &&
                        (st.peek() == '*' || st.peek() == '/' || st.peek() == '^')) ||
                       (ch == '^' && st.peek() == '^'))) {

                    if (ch == '^' && st.peek() == '^') break;

                    sb.append(st.pop());
                }

                st.push(ch);
            }
        }

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString();
    }
}
