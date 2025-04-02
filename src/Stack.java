// Stack.java

public class Stack {

    private StackNode top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void setTop(StackNode top) {
        this.top = top;
    }

    public StackNode peek() {
        return this.top;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public StackNode search(int index){
        StackNode node = this.peek();
        for (int i=0; i < index; i++){
            node = node.getNext();
        }
        return node;
    }

    public void push(StackNode node){
        if (this.peek() == null) {
            this.setTop(node);
        }
        else if (this.getSize() > 0 && this.peek() != null) {
            // pilha:
            // [3] [2] [1]
            // [2] [1]
            // [1]
            // Ao inserir qualquer item temos que:
            // first = novo_item
            // first.next = antigo_topo
            StackNode oldTop = this.peek();
            this.setTop(node);
            this.peek().setNext(oldTop);
        }
        this.setSize(this.getSize() + 1);
    }

    public StackNode pop(){
        StackNode getTopNode = this.peek();
        this.setSize(this.getSize() - 1);
        this.setTop(getTopNode.getNext());
        return getTopNode;
    }

}