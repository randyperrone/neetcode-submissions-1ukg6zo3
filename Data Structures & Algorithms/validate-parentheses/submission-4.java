class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
                System.out.println(stack);
            } else if (stack.isEmpty()) {
                return false;
            }
            else if (s.charAt(i) == '}') {
                char val = stack.pop();
                if (val != '{')
                    return false;
            } else if (s.charAt(i) == ']') {
                char val = stack.pop();
                if (val != '[')
                    return false;
            } else if (s.charAt(i) == ')') {
                char val = stack.pop();
                if (val != '(')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}