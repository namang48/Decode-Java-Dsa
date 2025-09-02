package LinkedList.SinglyLL;


public class implementLL {
    public static void main(String[] args) {
        SinglyL list = new SinglyL();

        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtTail(40);
        list.addAtTail(50);

        list.print();

        list.addAtHead(20);
        list.print();

        list.insert(9, 45);
        list.print();

//        System.out.println("Size : "+list.size());
        list.printSize();
//        System.out.println("Item at index 6 : "+list.getElement(6));
        list.setElement(3, 35);
        list.print();

        list.deleteAtHead();
        list.print();

        list.deleteAtTail();
        list.print();

        list.delete(3);
        list.print();

    }

}
