public class DoublyLinkedList {
    NewNode head, tail;
    int size;

    public boolean isEmpty() {
        return this.head == null;
    }

    public int getSize() {
        return size;
    }

    public void addNode(int data) {

        NewNode newNode = new NewNode(data);
        if (head == null) {

            head = newNode;
            tail = newNode;
            head.previous = null;
            tail.next = null;
            size++;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
            size++;
        }
    }

    public void display() {
        NewNode current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println("");
    }

    public void insertAtPosition(int location, int value) throws ArrayIndexOutOfBoundsException{
        NewNode currNode;
        if(location<1 || location>size){
            throw new ArrayIndexOutOfBoundsException("IndexOutBound");
        }
        else {
            currNode = this.head;
            for(int i=1; i<location;i++){
                currNode = currNode.next;
            }
            currNode.value=value;
        }

    }

    public void insertAtFirst(int value)
    {
        insertAtPosition(1,value);
    }

    public void insertAtLast(int value)
    {
        insertAtPosition(getSize(),value);
    }

    public void deleteAtPosition(int location){

        NewNode currNode;
        NewNode currNode2;
        if(location<1 || location>size){
            throw new ArrayIndexOutOfBoundsException("IndexOutBound");
        }
        else {
            currNode = this.head;
            if (location == 1) {
                head=head.next;
                size--;

            }
            else {
                for (int i = 1; i < location; i++) {
                    currNode = currNode.next;
                }
                NewNode temp = currNode.next;
                currNode = null;

                currNode2 = this.head;
                for (int i = 1; i < location - 1; i++) {
                    currNode2 = currNode2.next;
                }
                currNode2.next = temp;

                size--;
            }
        }

    }

    public void deleteAtFirst()
    {
        deleteAtPosition(1);
    }

    public void deleteAtLast()
    {
        deleteAtPosition(getSize());
    }

    public boolean search(int value)
    {
        NewNode currNode = this.head;
        while (currNode != null) {
            if(currNode.value ==value)
                return true;
            currNode = currNode.next;
        }
        return false;
    }

}