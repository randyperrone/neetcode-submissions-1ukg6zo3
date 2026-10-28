class Solution {
    public int calPoints(String[] operations) {
        List<Integer> vals = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            if(operations[i].equals("+")) {
                Integer valToAdd = vals.getLast() + vals.get(vals.size() - 2);
                vals.addLast(valToAdd);
            } else if (operations[i].equals("C")) {
                vals.removeLast();
            } else if (operations[i].equals("D")) {
                vals.addLast(vals.getLast() * 2);
            } else {
                vals.addLast(Integer.parseInt(operations[i]));
            }
        }
        int ret = 0;
        for (Integer i: vals) {
            ret += i;
        }
        return ret;
    }
}