class Solution {
    public int minOperations(String[] logs) {
        Deque<String> system = new ArrayDeque<>();
        for(String log: logs) {
            if (log.equals("../")) {
                if(!system.isEmpty())
                    system.pop();
            } else if (!log.equals("./")) {
                System.out.println("add: " + log);
                system.push(log);
            } 
        }
        return system.size();
    }
}