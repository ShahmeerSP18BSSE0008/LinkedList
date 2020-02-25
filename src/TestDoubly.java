public class TestDoubly
{
    public static void main(String[] args) {

        DoublyLinkedList linkedList = new DoublyLinkedList();
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(5);
        linkedList.addNode(6);
        linkedList.insertAtPosition(2,9);
        linkedList.display();
        linkedList.insertAtFirst(11);
        linkedList.display();
        linkedList.insertAtLast(111);
        linkedList.display();
        System.out.println(linkedList.getSize());
        linkedList.deleteAtFirst();
        linkedList.display();
        linkedList.deleteAtLast();
        linkedList.display();
        linkedList.deleteAtPosition(3);
        linkedList.display();
        System.out.println(linkedList.getSize());
        System.out.println(linkedList.search(3));

    }
}
