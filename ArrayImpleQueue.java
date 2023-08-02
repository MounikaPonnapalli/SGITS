//15.1 Array Implementation of Queue without using collections.
import java.util.Scanner;
public class ArrayImpleQueue
{
    private int num;
    private int[] queueArr;
    private int front;
    private int rear;
    private int currentSize;
    public ArrayImpleQueue(int num)
    {
        this.num=num;
        queueArr=new int[num];
        front=0;
        rear=-1;
        currentSize=0;
    }
    public boolean isEmpty()
    {
        return currentSize==0;
    }
    public boolean isFull() 
    {
        return currentSize==num;
    }
    public void enqueue(int value)
    {
        if(isFull()) 
        {
            System.out.println("Queue is full"+value);
        } 
        else
        {
            rear=(rear+1)%num;
            queueArr[rear]=value;
            currentSize++;
            System.out.println(value+ " enqueued to the queue");
        }
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        } 
        else 
        {
            int dequeEle=queueArr[front];
            front=(front+1)%num;
            currentSize--;
            System.out.println(dequeEle+ " dequeued from the queue");
            return dequeEle;
        }
    }
    public int peek()
    {
        if (isEmpty())
        {
            System.out.println("Queue is empty. Nothing to peek");
            return -1;
        } 
        else 
        {
            int peekEle=queueArr[front];
            System.out.println("Front element:"+peekEle);
            return peekEle;
        }
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int num=input.nextInt();
        ArrayImpleQueue queue=new ArrayImpleQueue(num);
        System.out.println("Queue operations:");
        System.out.println("1.Enqueue");
        System.out.println("2.Dequeue");
        System.out.println("3.Peek");
        System.out.println("4.Exit");
        int ch=-1;
        while(ch!=4)
        {
            System.out.print("Enter your choice: ");
            ch=input.nextInt();
            switch(ch) 
            {
                case 1:
                    System.out.print("Enter the value to enqueue: ");
                    int ele=input.nextInt();
                    queue.enqueue(ele);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    System.out.println("Exit..!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

