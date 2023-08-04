//Implementation of linkedlist using queue.
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
class Queue
{
    private Node front;
    private Node rear;
    public Queue() 
    {
        this.front=null;
        this.rear=null;
    }
    public boolean isEmpty()
    {
        return front==null;
    }
    public void enqueue(int data)
    {
        Node newNode=new Node(data);
        if (isEmpty()) 
        {
            front=rear=newNode;
        }
        else 
        {
            rear.next=newNode;
            rear=newNode;
        }
    }
    public int dequeue()
    {
        if (isEmpty()) 
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int data=front.data;
        front=front.next;
        if(front==null) 
        {
            rear=null;
        }
        return data;
    }
    public void display()
    {
        Node current=front;
        while(current!=null) 
        {
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
}
public class QueueLinkedList
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Queue queue=new Queue();
        System.out.println("Enter elements to enqueue to the Queue:");//-1 to stop
        int data;
        while((data=input.nextInt())!=-1) 
        {
            queue.enqueue(data);
        }
        System.out.println("Queue contents:");
        queue.display();
        System.out.println("Dequeueing elements from the queue:");
        while(!queue.isEmpty()) 
        {
            System.out.println(queue.dequeue());
        }
    }
}
