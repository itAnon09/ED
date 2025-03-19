import org.junit.Assert;
import org.junit.Test;

public class TestStack {
    @Test
    public void testIsEmpty(){
        Stack testStack = new Stack();
        Assert.assertTrue(testStack.isEmpty());
    }

    @Test
    public void testInsert(){
        Stack testStack = new Stack();
        StackNode newNode1 = new StackNode("Oi");
        StackNode newNode2 = new StackNode("Tudo");
        StackNode newNode3 = new StackNode("Bem");

        testStack.addNode(newNode1);
        Assert.assertEquals(testStack.getSize(), 1);

        testStack.addNode(newNode2);
        Assert.assertEquals(testStack.getSize(), 2);

        testStack.addNode(newNode3);
        Assert.assertEquals(testStack.getSize(), 3);
    }


    @Test
    public void testRemove(){
        Stack testStack = new Stack();
        StackNode newNode1 = new StackNode("Oi");
        StackNode newNode2 = new StackNode("Tudo");
        StackNode newNode3 = new StackNode("Bem");

        testStack.addNode(newNode1);
        Assert.assertEquals(testStack.getSize(), 1);

        StackNode removedNode = testStack.popNode();
        Assert.assertEquals(removedNode.getObject(), newNode1.getObject());

        testStack.addNode(newNode1);
        testStack.addNode(newNode2);
        testStack.addNode(newNode3);

        Assert.assertEquals(testStack.getSize(), 3);

        removedNode = testStack.popNode();
        Assert.assertEquals(removedNode.getObject(), newNode3.getObject());

        removedNode = testStack.popNode();
        Assert.assertEquals(removedNode.getObject(), newNode2.getObject());

        removedNode = testStack.popNode();
        Assert.assertEquals(removedNode.getObject(), newNode1.getObject());
    }

}
