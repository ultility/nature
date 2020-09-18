package assistants;

import testers.MyListTester;

import java.util.List;

public class MyListNode {
    private Object objectType;
    private Object data;
    private MyListNode next;
    private MyListNode previous;

    /**
     * default constractor
     */
    public MyListNode() {
        data = null;
        next = null;
        objectType = null;
    }

    /**
     * contractor for data only
     * @param data data to keep
     */
    public MyListNode(Object data) {
        if (data == null) {
            objectType = null;
        }
        else {
            objectType = data.getClass();
        }
        this.data = data;
        next = null;

    }

    /**
     * contractor for data and next list cell
     * @param data data to keep
     * @param next the next list cell
     */
    public MyListNode(Object data, MyListNode next) {
        objectType = data.getClass();
        this.data = data;
        this.next = next;
    }
    /**
     * contractor for data and next list cell
     * @param data data to keep
     * @param next the next list cell
     * @param prev the previous list cell
     */
    public MyListNode(Object data, MyListNode next, MyListNode prev) {
        objectType = data.getClass();
        this.data = data;
        this.next = next;
        previous = prev;
    }

    /**
     * returns the data
     * @return the data
     */
    public Object getData() {
        return data;
    }

    /**
     * returns the data's type/class
     * @return
     */
    public Object getDataType() {
        return objectType;
    }

    /**
     * returns the next list cell
     * @return the next list cell
     */
    public MyListNode getNext() {
        return next;
    }

    /**
     * returns the previous cell
     * @return the previous cell
     */
    public MyListNode getPrevious() {
        return previous;
    }

    /**
     * sets the next list cell.
     * returns true if was set successfully
     * @param next the new list cell
     * @return true if was set successfully
     */
    public boolean setNext(MyListNode next) {
        if (next == null) {
            this.next = next;
            return true;
        }
        if (objectType == null) {
            if (next.getData() != null) {
                objectType = next.getData().getClass();
                this.next = next;
                return true;
            }
        }
        if (objectType == next.getDataType()) {
            this.next = next;
            return true;
        }
        return false;
    }

    public String toString() {
        return "data type=" + ("" + objectType).substring(("" + objectType).lastIndexOf('.') + 1);
    }
}
