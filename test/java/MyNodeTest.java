import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyNodeTest {
    @Test
    void given3numbersWhenLinkedListShouldPassedLinkedListTest() {
        MyNode<Integer> firstNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(57);
        MyNode<Integer> thirdNode = new MyNode<>(58);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        boolean result = firstNode.getNext().equals(secondNode)&&
                         secondNode.getNext().equals(thirdNode);
        Assertions.assertTrue(result);

    }
}
