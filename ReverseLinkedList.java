//12.6 Reverse Linked List without using collections.
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
public class ReverseLinkedList 
{
    private Node head;
    public ReverseLinkedList()
    {
        head=null;
    }
    public void reverse() 
    {
        Node prev=null;
        Node current=head;
        Node next;
        while(current!=null) 
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
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
        ReverseLinkedList list=new ReverseLinkedList();
        System.out.print("Enter the number of elements in the linked list u want:");
        int num=input.nextInt();
        Node prev=null;
        System.out.println("Enter the elements:");
        for(int i=0;i<num;i++)
        {
            int data=input.nextInt();
            Node newNode=new Node(data);
            if(prev==null)
            {
                list.head=newNode;
            }
            else
            {
                prev.next=newNode;
            }
            prev=newNode;
        }
        System.out.println("Linked list:");
        list.display();
        list.reverse();
        System.out.println("Reversed Linked List:");
        list.display();
    }
}
