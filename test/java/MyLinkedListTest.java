import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    @Test
   public void given3numbersWhenLinkedListShouldBeAddedToTop() {
        MyNode<Integer> thirdNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(30);
        MyNode<Integer> firstNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.add(secondNode);
        myLinkedList.add(thirdNode);
        myLinkedList.printMyNode();

        boolean result = myLinkedList.head.equals(thirdNode) &&
                         myLinkedList.head.getNext().equals(secondNode) &&
                         myLinkedList.tail.equals(firstNode);
        Assert.assertTrue(result);
    }
}
