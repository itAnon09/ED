import org.junit.Assert;
import org.junit.Test;

public class TestStack {
    @Test
    public void testIsEmpty(){
        Stack testStack = new Stack();
        Assert.assertTrue(testStack.isEmpty());
    }

    @Test
    public void testpush(){
        Stack testStack = new Stack();
        StackNode newNode1 = new StackNode("Oi");
        StackNode newNode2 = new StackNode("Tudo");
        StackNode newNode3 = new StackNode("Bem");

        testStack.push(newNode1);
        Assert.assertEquals(testStack.getSize(), 1);

        testStack.push(newNode2);
        Assert.assertEquals(testStack.getSize(), 2);

        testStack.push(newNode3);
        Assert.assertEquals(testStack.getSize(), 3);
    }


    @Test
    public void testRemove(){
        Stack testStack = new Stack();
        StackNode newNode1 = new StackNode("Oi");
        StackNode newNode2 = new StackNode("Tudo");
        StackNode newNode3 = new StackNode("Bem");

        testStack.push(newNode1);
        Assert.assertEquals(testStack.getSize(), 1);

        StackNode removedNode = testStack.pop();
        Assert.assertEquals(removedNode.getObject(), newNode1.getObject());

        testStack.push(newNode1);
        testStack.push(newNode2);
        testStack.push(newNode3);

        Assert.assertEquals(testStack.getSize(), 3);

        removedNode = testStack.pop();
        Assert.assertEquals(removedNode.getObject(), newNode3.getObject());

        removedNode = testStack.pop();
        Assert.assertEquals(removedNode.getObject(), newNode2.getObject());

        removedNode = testStack.pop();
        Assert.assertEquals(removedNode.getObject(), newNode1.getObject());
    }

}
