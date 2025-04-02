import java.lang.reflect.Array;

//Main.java
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Stack minhaPilha = new Stack();
        StackNode novoNo1 = new StackNode("1");
        StackNode novoNo2 = new StackNode(2);
        StackNode novoNo3 = new StackNode("Hello World");
        // NOVOS NóS A SEREM INSERIDOS.
        minhaPilha.push(novoNo1);
        minhaPilha.push(novoNo2);
        minhaPilha.push(novoNo3);

        System.out.println("tamanho antigo " + minhaPilha.getSize());

        StackNode ultimo = minhaPilha.pop();

        StackNode ultimo2 = minhaPilha.pop();
        StackNode ultimo3 = minhaPilha.pop();
        System.out.println("last removed = " + ultimo.getObject());

        System.out.println("novo tamanho " + minhaPilha.getSize());

    }
}
