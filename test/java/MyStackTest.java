import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {
    @Test
    public void given3numbersWhenLinkedListShouldBeAddedToLast() {
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> thirdNode = new MyNode<>(56);

        MyStack myStack = new MyStack();

        myStack.push(firstNode);
        myStack.push(secondNode);
        myStack.push(thirdNode);
        myStack.printMyStack();
        INode peak = myStack.peak();
        Assert.assertEquals(thirdNode,peak);

    }
}
