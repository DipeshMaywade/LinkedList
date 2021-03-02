public interface INode <K>{
    K getKey();
    void setKet(K key);

    public MyNode getNext(){
        return getKey();
    }
    public void setNext (MyNode next){
        this.next = next;
    }
}
