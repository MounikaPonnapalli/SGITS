//Implementation of stack using linked list.
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
class Stack
{
    private Node head;
    public Stack() 
    {
        this.head=null;
    }
    public boolean isEmpty() 
    {
        return head==null;
    }
    public void push(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public int pop()
    {
        if(isEmpty()) 
        {
            System.out.println("Stack is empty");
            return -1;
        }
        int data=head.data;
        head=head.next;
        return data;
    }
    public int peek()
    {
        if(isEmpty())
         {
            System.out.println("Stack is empty");
            return -1;
        }
        return head.data;
    }
    public void display() 
    {
        Node current=head;
        while(current!=null) 
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
}
public class StackUsingLinkedList
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        Stack stack=new Stack();
        System.out.println("Enter elements push to the stack:");//-1 to stop
        int data;
        while((data=input.nextInt())!=-1)
        {
            stack.push(data);
        }
        System.out.println("Stack contents:");
        stack.display();
        System.out.println("Popping elements from the stack:");
        while(!stack.isEmpty()) 
        {
            System.out.println(stack.pop());
        }
    }
}
