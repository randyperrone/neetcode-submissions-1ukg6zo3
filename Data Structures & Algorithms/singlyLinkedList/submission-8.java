class ListNode {
    int val;
    ListNode next;

    ListNode (int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
    private ListNode head;
    private ListNode tail;
    private int size;

    public LinkedList() {
        size = 0;
    }

    public int get(int index) {
        if (index > size - 1) {
            return -1;
        }
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void insertHead(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        if (tail == null) tail = node;
        size++;
    }

    public void insertTail(int val) {
        ListNode node = new ListNode(val);
        if (tail == null) {
            tail = head = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public boolean remove(int index) {
        if (index > size - 1) {
            return false;
        }
        if (head == tail) {
            head = tail = null;
        } else if (index == 0) {
            head = head.next;
        } else {
            ListNode curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            if (curr.next.next == null) {
                curr.next = null;
                tail = curr;
            } else {
                curr.next = curr.next.next;
            }
        }
        size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        return list;
    }
}
