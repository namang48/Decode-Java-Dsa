package LinkedList;

import java.util.Scanner;

class LinkedList{
    int data;
    LinkedList link;

    public LinkedList(int data){
        this.data=data;
    }

    public void printList(){
        LinkedList point=this;
        while(point!=null){
            System.out.print(point.data+"\t");
            point=point.link;
        }
        System.out.println();
    }

    public void add(int n){
        LinkedList temp=new LinkedList(n);
        LinkedList point=this;
        while(point.link!=null){
            point=point.link;
        }
        point.link=temp;
    }

    public void createList(int n){

        LinkedList point=this;
        for(int i=0;i<n;i++){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter data "+(i+2)+": ");
            int data=sc.nextInt();
            LinkedList temp=new LinkedList(data);
            point.link=temp;
            point=point.link;
        }
        System.out.println("List Created Successfully !");
    }
    public void printRecursive(LinkedList head){
        if(head==null)
            return;
        System.out.println(head.data);
        printRecursive(head.link);
    }

    public void printReverse(LinkedList head){
        if(head==null)
            return;
        printRecursive(head.link);
        System.out.println(head.data);
    }



}
public class List{
    public static void main(String[] args) {

        System.out.print("Enter number of nodes :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter data 1 : ");
        int data=sc.nextInt();
        LinkedList head=new LinkedList(data);
        head.createList(n-1);
        head.printRecursive(head);
    }
}