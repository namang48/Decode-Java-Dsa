package StackLLImplement;
import java.util.Scanner;

public class Stack {
    Node top;
    public Stack(){
        System.out.println("Enter number of Nodes : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1 ; i<=n ; i++){
            System.out.print("Enter data "+i+" : ");
            push(sc.nextInt());
        }
    }
    public void print(){
        if(isEmpty()){
            System.out.println("Stack Underflow !!");
            return;
        }
        System.out.println("Elements of stack from Top to Bottom");
        for(Node temp=top ; temp!=null ; temp=temp.next){
            System.out.print(temp.data + "\t");
        }
        System.out.println();
    }
    public void push(int data){
        Node temp=new Node(data);
        if(top == null)
            top=temp;
        else{
            temp.next=top;
            top=temp;
        }
    }
    public int pop(){
        Node point=top;
        int temp=top.data;
        top=top.next;
        point.next=null;
        return temp;
    }
    public void top(){System.out.println("Top elements : "+top.data);}
    public boolean isEmpty(){
        return top == null;
    }
    public boolean isFull(){
        Node temp=new Node(8);
        return temp == null;

    }
    public int size(){
        int size=0;
        Node temp=top;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
}
class StackLinkedList{
    public static void main(String[] args) {

        Stack stack=new Stack();
        stack.top();
        stack.print();
        System.out.println("Removed Element after pop() :"+stack.pop());
        stack.print();
        System.out.println("Is stack empty ? :: "+stack.isEmpty());
        System.out.println("Is stack full ? :: "+stack.isFull());
        System.out.println("Size of Stack :: "+ stack.size());
    }
}
