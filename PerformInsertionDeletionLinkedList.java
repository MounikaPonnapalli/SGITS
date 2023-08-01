//Perfom insertion deletion in a linked list without using collection frameworks.
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
public class PerformInsertionDeletionLinkedList
{
    private Node head;
    public PerformInsertionDeletionLinkedList() 
    {
        head=null;
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
    public void insert(int data) 
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        } 
        else
        {
            Node current=head;
            while(current.next!=null)
            {
                current=current.next;
            }
            current.next=newNode;
        }
    }
    public void delete(int data) 
    {
        if(head==null) 
        {
            return;
        }
        if(head.data==data)
        {
            head=head.next;
            return;
        }
        Node current=head;
        Node prev=null;
        while(current!=null&&current.data!=data)
        {
            prev=current;
            current=current.next;
        }
        if(current==null) 
        {
            System.out.println("Element not found in the list.");
            return;
        }
        prev.next=current.next;
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        PerformInsertionDeletionLinkedList list = new PerformInsertionDeletionLinkedList();
        System.out.print("Enter the number of elements in the linked list u want: ");
        int num=input.nextInt();
        Node prev=null;
        System.out.println("Enter the elements:");
        for(int i=0;i<num;i++)
        {
            int data=input.nextInt();
            list.insert(data);
        }
        System.out.println("Linked list:");
        list.display();
        System.out.print("Enter the element you want to delete: ");
        int deleteElement = input.nextInt();
        list.delete(deleteElement);
        System.out.println("Linked list after deletion:");
        list.display();
    }
}