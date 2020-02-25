public class TestSingly {


    public static void main(String[] args) {


        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<Integer>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(50);

        linkedList.printList();
        System.out.println();
        System.out.println(linkedList.head.value);
        System.out.println(linkedList.tail.value);
        System.out.println("Size: "+linkedList.getSize() ); // 2-getSize() method
        System.out.println(linkedList.contains(50)); //6-search method returns boolean
        System.out.println(linkedList.isEmpty()); // 1-isEmpty() method
        try {
            System.out.println(linkedList.getLocation(3).value);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(linkedList.search(20)); // 6- search() method returns position

        linkedList.setAt(1, 30);
        try {
            System.out.println(linkedList.getLocation(1).value);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        linkedList.printList();
        System.out.println("Delete 3rd");
        linkedList.removeAt(3);  // 3-deleteAtPosition() method
        linkedList.printList();
        linkedList.deleteFirst(); // 5-deleteFirst() method
        linkedList.printList();
        System.out.println(linkedList.search(50));
        linkedList.printList();
        linkedList.insertAtLast(90);
        linkedList.printList();// 4-insertAtLast method


    }
}
