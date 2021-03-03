import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
    @Test
    public void given3numbersInQueueFirstPushedNodeShouldBeTOS(){
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(56);

        MyQueue myQueue = new MyQueue();

        myQueue.push(thirdNode);
        myQueue.push(secondNode);
        myQueue.push(firstNode);
        myQueue.printQueue();
        INode peak = myQueue.peak();

        Assert.assertEquals(thirdNode,peak);
    }

    @Test
    public void given3numbersInQueuePoppedShouldMatchWithFirstAddedNode(){
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(56);

        MyQueue myQueue = new MyQueue();

        myQueue.push(thirdNode);
        myQueue.push(secondNode);
        myQueue.push(firstNode);
        myQueue.printQueue();
        INode dequeueValue = myQueue.dequeue();
        myQueue.printQueue();

        Assert.assertEquals(thirdNode,dequeueValue);
    }
}
