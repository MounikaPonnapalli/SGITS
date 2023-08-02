//14.1 Illustate stack operation using arrays.
import java.util.Scanner;
public class  StackOperationUsingArrays
{
    private int num;
    private int[] stackArr;
    private int top;
    public StackOperationUsingArrays(int num) 
    {
        this.num=num;
        stackArr=new int[num];
        top=-1;
    }
    public boolean isEmpty() 
    {
        return top==-1;
    }
    public boolean isFull()
    {
        return top==num-1;
    }
    public void push(int value) 
    {
        if(isFull()) 
        {
            System.out.println("Stack is full "+value);
        } 
        else 
        {
            stackArr[++top]=value;
            System.out.println(value+" pushed to the stack");
        }
    }
    public int pop() 
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return -1;
        } 
        else
        {
            int popEle=stackArr[top--];
            System.out.println(popEle+" popped from the stack");
            return popEle;
        }
    }
    public int peek() 
    {
        if(isEmpty()) 
        {
            System.out.println("Stack is empty");
            return -1;
        } 
        else
        {
            int peekEle=stackArr[top];
            System.out.println("Top element:"+peekEle);
            return peekEle;
        }
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of elements in the stack:");
        int num=input.nextInt();
        StackOperationUsingArrays stack=new StackOperationUsingArrays(num);
        System.out.println("Stack operations:");
        System.out.println("1.Push");
        System.out.println("2.Pop");
        System.out.println("3.Peek");
        System.out.println("4.Exit");
        int ch=-1;
        while(ch!=4)
        {
            System.out.print("Enter your choice:");
            ch=input.nextInt();
            switch(ch) 
            {
                case 1:
                    System.out.print("Enter the value to push:");
                    int value=input.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
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