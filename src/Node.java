import javax.print.attribute.standard.NumberOfDocuments;

public class Node<T>{
    Node next;
    Object value;

    public Node() {
        next=null;

    }

    public Node(T value) {
        this.value = value;
    }
}
