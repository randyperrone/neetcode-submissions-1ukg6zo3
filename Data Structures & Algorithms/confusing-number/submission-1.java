class Solution {
    public boolean confusingNumber(int n) {
        int reverse = 0;
        int number = n;
        while(number > 0) {
            int currNum = number % 10;
            if (reverseInt(currNum) == -1) {
                return false;
            }
            reverse *= 10;
            reverse += reverseInt(currNum);
            number = number / 10;
        }
        return n != reverse;
    }

    public int reverseInt(int n) {
        return switch(n) {
            case 2, 3, 4, 5, 7 -> -1;
            case 0, 1, 8 -> n;
            case 6 -> 9;
            case 9 -> 6;
            default -> 0;
        };
    }
}
