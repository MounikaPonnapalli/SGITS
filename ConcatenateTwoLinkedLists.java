//Concatenate two linked lists without using collections
import java.util.LinkedList;
import java.util.Scanner;
class Node 
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class ConcatenateTwoLinkedLists 
{
    private Node head;
    public ConcatenateTwoLinkedLists() 
    {
        head=null;
    }
     public void concatenate(ConcatenateTwoLinkedLists List)
    {
        if(head==null)
        {
            head=List.head;
        }
        else
        {
            Node current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=List.head;
        }
    }
    public void display() 
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data);
            if(current.next!=null)
            {
                System.out.print("->");
            }
            current=current.next;
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        ConcatenateTwoLinkedLists  list1=new ConcatenateTwoLinkedLists ();
        System.out.print("Enter the number of elements in the first linked list u want:");
        int num=input.nextInt();
        Node prev=null;
        System.out.println("Enter the elements:");
        for(int i=0;i<num;i++)
        {
            int data=input.nextInt();
            Node newNode=new Node(data);
            if(prev==null)
            {
                list1.head=newNode;
            }
            else
            {
                prev.next=newNode;
            }
            prev=newNode;
        }
        System.out.println(" First Linked list:");
        list1.display();
        ConcatenateTwoLinkedLists  list2=new ConcatenateTwoLinkedLists ();
        System.out.print("Enter the number of elements in the Second linked list u want:");
        int num2=input.nextInt();
        Node prev2=null;
        System.out.println("Enter the elements:");
        for(int i=0;i<num2;i++)
        {
            int data=input.nextInt();
            Node newNode=new Node(data);
            if(prev2==null)
            {
                list2.head=newNode;
            }
            else
            {
                prev2.next=newNode;
            }
            prev2=newNode;
        }
        System.out.println(" Second Linked list :");
        list2.display();
        list1.concatenate(list2);
        list1.display();
    }
}
