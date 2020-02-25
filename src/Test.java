public class Test {
    public static void main(String[] args) {


        CircularLinkedList<Integer> linkedList = new CircularLinkedList<>();

        linkedList.Add(10);
        linkedList.Add(20);
        linkedList.Add(30);
        linkedList.Add(50);
        System.out.println(linkedList.head.value);
        System.out.println(linkedList.tail.value);
        linkedList.PrintList();
        System.out.println();
        System.out.println(linkedList.head.value);
        System.out.println(linkedList.tail.value);
        System.out.println("Size: " +linkedList.getSize() ); // 2- getSize method
        System.out.println(linkedList.contains(50));
        System.out.println(linkedList.isEmpty()); // 1-isEmpty() method

        try {
            System.out.println(linkedList.getLocation(30).value);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(linkedList.Search(50)); // 8-search() method

        linkedList.SetAtPosition(1, 300); //5-insetAtPosition() method
        try {
            System.out.println(linkedList.getLocation(1).value);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        linkedList.PrintList();
        System.out.println("\n "+"Delete 3rd");
        linkedList.RemoveAtPosition(2);
        linkedList.PrintList();
        linkedList.PrintList();
        linkedList.insertAtFirst(11); //4-insertAtFirst() method
        linkedList.PrintList();
        linkedList.insertAtLast(111);//3-insertAtLast() method
        linkedList.PrintList();
        linkedList.deleteAtFirst(); // 6-deleteatirst() method
        linkedList.PrintList();
        linkedList.deleteAtLast(); // 7-deleteatlast() method
        linkedList.PrintList();
    }
}
