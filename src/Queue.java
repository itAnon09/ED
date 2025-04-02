public class Queue {

    private QueueNode head;
    private int size;

    public Queue(){
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return this.getSize() == 0;
    }

    public int getSize(){
        return this.size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setHead(QueueNode newHead){
        this.head = newHead;
    }

    public QueueNode peek(){
        return this.head;
    }

    public boolean add(QueueNode node){
        try {
            if (this.getSize() == 0){
                this.setHead(node);
            }
            else if (this.peek() != null){
                QueueNode pointer = this.peek();
                for (int i = 0; i < this.getSize() - 1; i++){
                    pointer = pointer.getNext();
                }
                pointer.setNext(node);
            }
            this.setSize(this.getSize() + 1);
            return true;
        }
        catch (IllegalStateException e) {
            System.out.println(e + " No space is currently available.");
            return false;
        }
    }

//    private QueueNode element(){
//
//    }
//
//    private boolean offer(StackNode node){
//
//    }
//
//
//    private QueueNode poll(){
//
//    }
//
    private QueueNode remove(){
        return null;
    }
}
