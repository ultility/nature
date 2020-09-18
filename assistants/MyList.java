package assistants;

public class MyList {
    private MyListNode head;
    private MyListNode tail;

    public MyList() {
        head = null;
        tail = null;
    }

    public MyList(MyListNode head) {
        this.head = head;
        MyListNode current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        tail = current;
    }

    /**
     * adds a new list to the end of the list
     * @param newTail the head of list to add to the end
     * @return true if the the addition was successful.
     */
    public boolean append(MyListNode newTail) {
        if(tail.setNext(newTail)) {
            for (;newTail.getNext() != null; newTail = newTail.getNext());
            tail = newTail;
            return true;
        }
        return false;
    }
    

}
