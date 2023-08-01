//Sort linked list without using collection frameworks.
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
public class SortLinkedList
{
    private Node head;
    public SortLinkedList()
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
    public void bubbleSort()
    {
        if(head==null||head.next==null)
        {
            return;
        }
        boolean swapped;
        Node temp;
        while(true)
        {
            swapped=false;
            Node current=head;
            Node prev=null;
            while(current.next!=null)
            {
                if(current.data>current.next.data)
                {
                    temp=current.next;
                    current.next=current.next.next;
                    temp.next=current;
                    if(prev==null)
                    {
                        head=temp;
                    }
                    else
                    {
                        prev.next=temp;
                    }
                    prev=temp;
                    swapped=true;
                }
                else
                {
                    prev=current;
                    current=current.next;
                }
            }
            if(!swapped) 
            {
                break;
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        SortLinkedList list=new SortLinkedList();
        System.out.print("Enter the number of elements in the linked list: ");
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
        System.out.println("Linked list after sorting:");
        list.bubbleSort();
        list.display();
    }
}
