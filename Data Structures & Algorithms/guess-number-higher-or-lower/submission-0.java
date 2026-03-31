/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        //[1, 2, 3, 4, 5, 6, 7,, 8, 9, 10, 11, 12, 13, 14, 15]
        while (true) {
            int middle = left + (right - left) /2;

            if (guess(middle) < 0) {
                right = middle - 1;
            } else if (guess(middle) > 0) {
                
                left = middle + 1;
            } else {
                return middle;
            }
        }
    }
}