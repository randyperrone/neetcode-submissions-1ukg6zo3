/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if (intervals.isEmpty() || intervals.size() == 1) {
            return true;
        }
        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));
        Integer prevEnd = 0;
        for (Interval interval: intervals) {
            if (prevEnd > interval.start) {
                return false;
            }
            prevEnd = interval.end;
        }
        return true;
    }
}
