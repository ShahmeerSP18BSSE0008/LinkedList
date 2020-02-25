public class CircularLinkedList<T> {

    Node<T> head;
    Node<T> tail;
    int size;

    public void Add(T value){
        Node<T> newNode=new Node<T>(value);

        if(this.head==null){
            this.head=newNode;
            this.tail=newNode;
            head.next=tail;
            tail.next=head;
            size++;

        }
        else {
            Node<T> temp=head;
            while (temp.next!=head){
                temp=temp.next;

            }
            temp.next=newNode;
            //newNode.previous=temp;
            tail=newNode;
            tail.next=head;
            size++;
        }
    }

    public void PrintList()
    {
        Node currNode = this.head;
        System.out.print("-----SinglyLinkedList-------"+"\n");

        while (currNode.next != head) {
            System.out.print(currNode.value + " ");
            currNode = currNode.next;
        }
        //currNode = currNode.next;
        System.out.print(currNode.value + " ");
        System.out.println();
    }

    public boolean contains(Object value)
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

    public int getSize()
    {
        return size;
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
            this.Add(i);
        }
    }

    public int Search(Object value){
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


    public void SetAtPosition(int location, Object value) throws ArrayIndexOutOfBoundsException{
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

    public void RemoveAtPosition(int location){

        Node currNode;
        Node currNode2;
        if(location<1 || location>size){
            throw new ArrayIndexOutOfBoundsException("IndexOutBound");
        }
        else {
            currNode = this.head;
            if (location == 1) {
                tail.next=head.next;
                head=head.next;
                size--;

            }
            else {
                for (int i = 1; i < location; i++) {
                    currNode = currNode.next;
                }
                Node<T> temp = currNode.next;
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

    public void remove(Object value){
        int location=this.Search(value);
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

    public void insertAtFirst(T value)
    {
        SetAtPosition(1,value);
    }

    public void insertAtLast(T value)
    {
        SetAtPosition(getSize(),value);
    }

    public void deleteAtFirst()
    {
        RemoveAtPosition(1);
    }

    public void deleteAtLast()
    {
        RemoveAtPosition(getSize());
    }


}
