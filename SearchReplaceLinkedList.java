//12.5Search and replace an element in a linked List.
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
public class SearchReplaceLinkedList 
{
    private Node head;
    public SearchReplaceLinkedList()
    {
        head=null;
    }
    public void searchAndReplace(int searchEle,int replaceEle)
    {
        Node current=head;
        while(current!=null) 
        {
            if (current.data==searchEle)
            {
                current.data=replaceEle;
            }
            current=current.next;
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
        SearchReplaceLinkedList list=new SearchReplaceLinkedList();
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
        System.out.println("Enter the element to be Search:");
        int searchEle=input.nextInt();
        System.out.println("Enter the element to be replace:");
        int replaceEle=input.nextInt();
        list.searchAndReplace(searchEle,replaceEle);
        System.out.println("\nLinked List after Search and Replace:");
        list.display();
    }
}
