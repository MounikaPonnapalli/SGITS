//Create a Single linked list without using collection frameworks.
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
public class CreateLinkedListWithoutCollections 
{
    private Node head;
    public CreateLinkedListWithoutCollections() 
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
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        CreateLinkedListWithoutCollections list=new CreateLinkedListWithoutCollections();
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
    }
}
