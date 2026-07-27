class Solution {
    public boolean isValid(String s) {
        if (s.length() == 1) {
            return false;
        }
        Stack<Character> t = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{') {
                t.push(s.charAt(i));
            } else {
                if (t.empty()) {
                    return false;
                }
                Character temp = t.pop();
                if (s.charAt(i) == ']' && temp != '['){
                    return false;
                } else if (s.charAt(i) == ')' && temp != '(') {
                    return false;
                } else if (s.charAt(i) == '}' && temp != '{') {
                    return false;
                }
            }
        }
        return t.empty();
    }
}