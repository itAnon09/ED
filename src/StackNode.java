//StackNode.java
public class StackNode {

    private StackNode next;
    private Object object;

    public StackNode(Object object) {
        this.next = null;
        this.object = object;
    }

    public void setNext(StackNode next) {
        this.next = next;
    }

    public void setObject(Object value) {
        this.object = value;
    }

    public StackNode getNext() {
        return this.next;
    }

    public Object getObject() {
        return this.object;
    }
}
