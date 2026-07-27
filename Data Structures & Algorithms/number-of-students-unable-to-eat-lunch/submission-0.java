class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentQ = new LinkedList<>();
        for(int student: students) {
            studentQ.offer(student);
        }
        Stack<Integer> sandwichQ = new Stack<>();
        for(int i = sandwiches.length - 1; i >= 0; i--) {
            sandwichQ.push(sandwiches[i]);
        }

        int count = studentQ.size();
        while (count >= 0) {
            if (sandwichQ.empty() || studentQ.isEmpty()) {
                return studentQ.size();
            }
            if (studentQ.peek().equals(sandwichQ.peek())) {
                studentQ.poll();
                sandwichQ.pop();
                count = studentQ.size();
            } else {
                Integer temp = studentQ.poll();
                studentQ.offer(temp);
                count--;
            }
        }
        return studentQ.size();
    }
}