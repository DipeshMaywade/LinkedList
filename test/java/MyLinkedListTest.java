import org.junit.jupiter.api.Test;

public class MyLinkedListTest implements INode {
    @Test
    void Test1() {
        MyNode<Integer> thirdNode = new MyNode<>(56);
        MyNode<Integer> secondNode = new MyNode<>(57);
        MyNode<Integer> firstNode = new MyNode<>(58);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(firstNode);
        myLinkedList.add(secondNode);
    }
}
