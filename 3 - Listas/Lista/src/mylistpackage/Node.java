package mylistpackage;

public class Node<T> {
    T value;
    Node next;

    public Node(T value){
        this.value = value;
        this.next = null;
    }

    public T getValue(){
        return this.value;
    }

    public Node<T> getNext(){
        return this.next;
    }

    public void setNext(Node<T> node){
        this.next = node;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
