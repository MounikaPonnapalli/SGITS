//create single Circular Linked list without using  collections.
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
public class SingularCircularLinkedList
{
    private Node head;
    public void insert(int data)
    {
        Node newNode=new Node(data);
        if(head==null) 
        {
            head=newNode;
            head.next=head;
        }
        else 
        {
            newNode.next=head.next;
            head.next=newNode;
            head=newNode;
        }
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("Circular linked list is empty.");
            return;
        }
        Node current=head;
        while(true)
        {
            System.out.print(current.data+"->");
            current=current.next;
            if(current==head) 
            {
                break;
            }
        }
        System.out.println("head");
    }
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        SingularCircularLinkedList List=new SingularCircularLinkedList();
        System.out.print("Enter the number of elements to insert in the circular linked list:");
        int num=input.nextInt();
        System.out.println("Enter the elements:");
        for(int i=0;i<num;i++)
        {
            int data=input.nextInt();
            List.insert(data);
        }
        System.out.println(" Sigle Circular Linked List:");
        List.display();
    }
}
