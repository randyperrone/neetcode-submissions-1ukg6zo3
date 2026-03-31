class Solution {
    public String multiply(String num1, String num2) {
        return convertStringToInt(num1) * convertStringToInt(num2) + "";
    }

    private long convertStringToInt(String num) {
        int numToAdd = num.charAt(0) - '0';
        int numInt = numToAdd;
        for (int i = 1; i < num.length(); i++) {
            numToAdd = num.charAt(i) - '0';
            numInt = numInt * 10;
            numInt += numToAdd;
        }
        return numInt;
    }

}