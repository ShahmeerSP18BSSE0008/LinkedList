public class SinglyLinkedList<T> {
    Node<T> head;
    Node<T> tail;
    int size;

    public void add(T value){
        Node<T> newNode=new Node<T>(value);

        if(this.head==null){
            this.head=newNode;
            this.tail=newNode;
            size++;

        }
        else {
            Node<T> temp=head;
            while (temp.next!=null){
                temp=temp.next;

            }
            temp.next=newNode;
            //newNode.previous=temp;
            tail=newNode;
            size++;
        }
    }

    public void printList()
    {
        Node currNode = this.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.value + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public boolean contains(T value)
    {
        Node currNode = this.head;
        while (currNode != null) {
            if(currNode.value ==value)
                return true;
            currNode = currNode.next;
        }
        return false;
    }
    public boolean isEmpty(){
        return this.head==null;
    }

    public void clearAll(){
        this.head=null;
        this.tail=null;
    }

    public Node<T> getLocation(int location)throws ArrayIndexOutOfBoundsException{
        Node currNode;
        if(location<1 || location>size){
            throw new ArrayIndexOutOfBoundsException("IndexOutBound");
        }
        else{
            currNode = this.head;
            for(int i=1; i<location;i++){
                currNode = currNode.next;
            }
        }

        return currNode;
    }

    public void addAll(T[] arr){
        for(T i: arr){
            this.add(i);
        }
    }

    public int search(T value){
        int location = 0;
        if(this.contains(value)) {

            Node currNode = this.head;
            while (currNode.value != value) {
                location++;
                currNode = currNode.next;
            }
            location++;
        }
        return location;
    }

    public void setAt(int location, T value) throws ArrayIndexOutOfBoundsException{
        Node currNode;
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

    public void removeAt(int location){

        Node currNode;
        Node currNode2;
        if(location<1 || location>size){
            throw new ArrayIndexOutOfBoundsException("IndexOutBound");
        }
        else if(location == 1)
        {
            head=head.next;

        }
        else{
            currNode = this.head;
            for(int i=1; i<location;i++){
                currNode = currNode.next;
            }
            Node<T> temp=currNode.next;
            currNode=null;

            currNode2 = this.head;
            for(int i=1; i<location-1;i++){
                currNode2 = currNode2.next;
            }
            currNode2.next=temp;


            size--;
        }
    }

    public void remove(T value){
        int location=this.search(value);
        Node currNode;
        Node currNode2;
        if(location<1 || location>size){
            throw new ArrayIndexOutOfBoundsException("IndexOutBound");
        }
        else {
            currNode = this.head;
            for(int i=1; i<location;i++){
                currNode = currNode.next;
            }
            Node<T> temp=currNode.next;
            currNode=null;

            currNode2 = this.head;
            for(int i=1; i<location-1;i++){
                currNode2 = currNode2.next;
            }
            currNode2.next=temp;
            size--;
        }

    }

    public int getSize()
    {
        return size;
    }

    public void deleteFirst()
    {
        removeAt(1);
    }

    public void insertAtLast(T value)
    {
        setAt(getSize()-1,value);
    }


}
