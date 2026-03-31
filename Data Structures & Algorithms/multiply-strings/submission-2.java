class Solution {
    public String multiply(String num1, String num2) {
        long num1Int = convertStringToInt(num1);
        long num2Int = convertStringToInt(num2);
        System.out.println(num1Int);
        System.out.println(num2Int);
        long total = num1Int * num2Int;
        return total + "";
    }

    private int convertStringToInt(String num) {
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