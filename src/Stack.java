// Stack.java

public class Stack {

    private StackNode first;
    private StackNode last;
    private int size;
    public Stack() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void setFirst(StackNode first) {
        this.first = first;
    }

    public StackNode getFirst() {
        return this.first;
    }

    public void setLast(StackNode last) {
        this.last = last;
    }

    public StackNode getLast() {
        return this.last;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public StackNode getPreviousFromLast() {
        StackNode pointer = this.getFirst();
        for (int i = 0; i < this.getSize(); i++) {
            System.out.println(">>> " + pointer.getObject());
            if (pointer.getNext() == this.getLast()) {
                System.out.println("aa " + pointer.getNext().getObject());
                System.out.println("bb " + this.getLast().getObject());
                System.out.println("pointer.next == this.getLast()");
                return pointer;
            }
            pointer = pointer.getNext();
        }
        return null;
    }

    public void addNode(StackNode node){
        if (this.first == null) {
            this.setFirst(node);
            this.setLast(node);
            this.setSize(this.size + 1);
        }
        else if (this.getSize() > 0 && this.first != null) {
            StackNode pointer = this.getFirst();
            for (int i = 0; i < this.getSize() - 1; i++){
                pointer = pointer.getNext();
            }
            if (pointer.getNext() == null){
                pointer.setNext(node);
                this.setLast(node);
                this.setSize(this.size + 1);
            }
        }
    }

    public StackNode popNode(){
//      Simply removing the last will do (i think)
        System.out.println(this.getLast().getObject());
        if (this.isEmpty()){ return null; }

        if (this.getSize() == 1){
            StackNode removedNode = this.first;
            this.setFirst(null);
            this.setLast(null);
            this.size -= 1;
            return removedNode;
        }

        if (this.getLast().getNext() == null){
            StackNode lastNode = this.getLast();
            System.out.println("last.next is null");
            StackNode previousNode = this.getPreviousFromLast();
            previousNode.setNext(null);
            this.last = previousNode;
            this.size -= 1;

            System.out.println("this is the new last node " + this.getLast().getObject());
            return lastNode;
        }
        System.out.println("No change made!!!");
        return null;


//        StackNode pointer = this.first;
//        for (int i = 0; i < this.getSize() - 1; i++){
//            pointer = pointer.getNext();
//        }
//
//        if (pointer.getNext() == null){
//            System.out.println("This is the latest node");
//            System.out.println(pointer.getObject());
//            pointer.setObject(null);
//            this.setSize(this.size - 1);
//        }
    }
}