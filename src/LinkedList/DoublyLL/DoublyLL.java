package LinkedList.DoublyLL;

import java.util.Scanner;

public class DoublyLL {
    private Node head;
    private Node tail;
    private int size;

    public void add(int data){
        Node temp=new Node(data);

        if(head==null){
            head=tail=temp;
            return;
        }
        tail.next=temp;
        temp.prev=tail;
        tail=temp;
    }

    public void createList(){
        if(head!=null){
            System.out.println("List already exists !!");
            return;
        }
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of nodes : ");
        int num=sc.nextInt();
        for(int i=0 ; i<num ; i++){
            System.out.print("Enter data : ");
            add(sc.nextInt());
        }
    }

    public void addAtHead(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            size++;
            return;
        }
        head.prev=temp;
        temp.next=head;
        head=temp;
        size++;
    }

    public void addAtTail(int data){
        Node temp=new Node(data);
        if(head==null){
            head=tail=temp;
            size++;
            return;
        }
        tail.next=temp;
        temp.prev=tail;
        tail=temp;
        size++;
    }

    public void insert(int idx, int data){

    }

    public void print(){
        if(head==null){
            System.out.println("List Empty !!");
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"\t");
            temp=temp.next;
        }
        System.out.println();
    }

    public void printReverse(){
        if(head==null){
            System.out.println("List Empty !!");
            return;
        }
        Node temp=tail;
        while (temp!=null){
            System.out.print(temp.data+"\t");
            temp=temp.prev;
        }
        System.out.println();
    }

    public void size(){
        System.out.println("Size of List : " + size );
    }
}

class ImplementDoublyLL{
    public static void main(String[] args) {
        DoublyLL list=new DoublyLL();
        list.createList();
        list.print();
        list.printReverse();
    }
}