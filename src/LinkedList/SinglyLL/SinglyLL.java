package LinkedList.SinglyLL;

import LinkedList.Node;

class SinglyLL{
    private Node head;
    private Node tail;
    private int size;
    public SinglyLL(){}

    void addAtTail(int data){
        size++;
        Node temp=new Node(data);
        if(head==null) head=tail=temp;
        else{
            tail.next=temp;
            tail=tail.next;
        }
    }
    void print(){
        if(head==null){
            System.out.println("List empty !");
        }else {
            Node point = head;
            while (point != null) {
                System.out.print(point.data + "\t");
                point = point.next;
            }
            System.out.println();
        }
    }
    int size(){ return size; }
    void printSize(){  System.out.println("Size : "+ size); }

    void addAtHead(int data){
        Node temp=new Node(data);
        if(head==null)
            head=tail=temp;
        temp.next=head;
        head=temp;
        size++;
    }

    void insert(int index,int data){
        //gives error when list is empty !
        if (index>size || index <0) {
            System.out.println("Invalid index ! Data lost !");
            return;
        }
        if(index==0) {
            addAtHead(data);
            return;
        }
        if(size==index){
            addAtTail(data);
            return;
        }
        Node temp=new Node(data);
        Node point=head;
        for(int i=0;i<index-1;i++){
            point=point.next;
        }
        temp.next=point.next;
        point.next=temp;
        size++;
    }

    int getElement(int index) throws Error{
        if(head==null){
            throw new Error("List Empty !!");
        }
        if(index>=size || index<0){
            throw new Error("Invalid Index !!");
        }
//        if(index==0) return head.data;
        if(index==size-1)   return tail.data;
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }

    void setElement(int index,int data) throws Error{
        if(head==null){
            System.out.println("List Empty !!");
        }
        if(index>=size || index<0){
            System.out.println("Invalid Index !!");
        }
//        if(index==0) return head.data;
        if(index==size-1)   tail.data=data;
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        temp.data=data;
    }

    void deleteAtHead(){
        if(size==0){
            System.out.println("List Empty !!");
        }
        Node temp=head;
        head=head.next;
        temp.next=null;
        size--;
    }
    void deleteAtTail(){
        if(size==0){
            System.out.println("List Empty !!");
        }
        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
        tail=temp;
        size--;
    }

    void delete(int index){
        if(head == null){
            System.out.println("List Empty");
            return;
        }
        if(index==0) {
            deleteAtHead();
            return;
        }
        if(index==size-1) {
            deleteAtTail();
            return;
        }
        if(index>=size || size<0){
            System.out.println("Invalid index !!");
        }
        Node tempPrev=head;
        Node tempNext=head.next;
        for(int i=0 ; i<index-1;i++){
            tempPrev=tempNext;
            tempNext=tempNext.next;
        }
        tempPrev.next=tempNext.next;
        tempNext.next=null;
        size--;
    }
}

