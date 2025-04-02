public class QueueNode {

    private QueueNode next;
    private Object object;

    public QueueNode(Object object) {
        this.next = null;
        this.object = object;
    }

    public void setNext(QueueNode next) {
        this.next = next;
    }

    public void setObject(Object value) {
        this.object = value;
    }

    public QueueNode getNext() {
        return this.next;
    }

    public Object getObject() {
        return this.object;
    }
}
