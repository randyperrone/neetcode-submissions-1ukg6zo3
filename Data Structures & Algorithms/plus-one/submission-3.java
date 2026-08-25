class Solution {
    public int[] plusOne(int[] digits) {
        long num = 0;
        for(int digit: digits) {
            num *= 10;
            num += digit;
        }
        num += 1;
        long temp = num;
        int count = 0;
        while(temp > 0) {
            temp = temp / 10;
            count++;
        }
        int[] result = new int[count];
        while(num > 0) {
            long singleNum = num % 10;
            int singleNumInt = (int) singleNum;
            result[count - 1] = singleNumInt;
            count--;
            num = num / 10;
        }
        return result;
    }
}
