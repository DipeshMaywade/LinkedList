public class MyLinkedList {
    private INode head;
    private  INode tail;

    public MyLinkedList(){
        this.head=null;
        this.tail=null
    }
    public void add(INode mynode){
        this.head = mynode;
        this.tail = mynode;
    }

}
