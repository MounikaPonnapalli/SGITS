//12.4Maximun and minimum of a linkedlist without using collections.
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
public class MaxndMinLinkedList 
{
    private Node head;
    public MaxndMinLinkedList()
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
    public void MaxMin()
    {
        if(head==null)
        {
            System.out.println("The linked list is empty.");
            return;
        }
        int max=head.data;
        int min=head.data;
        Node current=head;
        while(current!=null)
        {
            if(current.data>max)
            {
                max=current.data;
            }
           if(current.data<min)
            {
                min=current.data;
            }
            current=current.next;
        }
        System.out.println("Maximum element:"+max);
        System.out.println("Minimum element:"+min);
    }
    public static void main(String[] args)
    {
         Scanner input=new Scanner(System.in);
        MaxndMinLinkedList list=new MaxndMinLinkedList();
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
        list.MaxMin();
        System.out.println();
    }
}
