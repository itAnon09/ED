import org.junit.Assert;
import org.junit.Test;

public class TestQueue {
    @Test
    public void testIsEmpty(){
        Queue testQueue = new Queue();
        Assert.assertTrue(testQueue.isEmpty());
    }

    @Test
    public void testAdd(){
        Queue testQueue = new Queue();
        QueueNode newNode1 = new QueueNode("Oi");
        QueueNode newNode2 = new QueueNode("Tudo");
        QueueNode newNode3 = new QueueNode("Bem");

        testQueue.add(newNode1);
        Assert.assertEquals(testQueue.getSize(), 1);

        testQueue.add(newNode2);
        Assert.assertEquals(testQueue.getSize(), 2);

        testQueue.add(newNode3);
        Assert.assertEquals(testQueue.getSize(), 3);
    }


//    @Test
//    public void testRemove(){
//        Queue testQueue = new Queue();
//        QueueNode newNode1 = new QueueNode("Oi");
//        QueueNode newNode2 = new QueueNode("Tudo");
//        QueueNode newNode3 = new QueueNode("Bem");
//
//        testQueue.add(newNode1);
//        Assert.assertEquals(testQueue.getSize(), 1);
//
//        QueueNode removedNode = testQueue.remove();
//        Assert.assertEquals(removedNode.getObject(), newNode1.getObject());
//
//        testQueue.add(newNode1);
//        testQueue.add(newNode2);
//        testQueue.add(newNode3);
//
//        Assert.assertEquals(testQueue.getSize(), 3);
//
//        removedNode = testQueue.remove();
//        Assert.assertEquals(removedNode.getObject(), newNode3.getObject());
//
//        removedNode = testQueue.remove();
//        Assert.assertEquals(removedNode.getObject(), newNode2.getObject());
//
//        removedNode = testQueue.remove();
//        Assert.assertEquals(removedNode.getObject(), newNode1.getObject());
//    }

}
