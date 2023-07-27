//Insert and deletemelements in a queue.
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class QueueInsertDle42 
{
    public static void main(String[] args)
    {
        Queue<Integer>num=new LinkedList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of Elements in Queue:");
        int number=input.nextInt();
        System.out.println("Enter the Elements:");
        for(int i=0;i<number;i++)
        {
            int numbers=input.nextInt();
            num.offer(numbers);
        }
        System.out.println("Queue:"+num);
        /*int accessedNumber=num.peek();
        System.out.println("Accessed Element:"+accessedNumber);
        int removedNumber=num.poll();
        System.out.println("Removed Element:"+removedNumber);*/
        System.out.print("Enter the element you want to insert: ");
        int elementToInsert=input.nextInt();
        System.out.print("Enter the index where you want to insert the element: ");
        int indexToInsert=input.nextInt();
        //Remove elements from the front and store them temporarily
        Queue<Integer>tempQueue=new LinkedList<>();
        for(int i=0;i<indexToInsert&&!num.isEmpty();i++) 
        {
            tempQueue.offer(num.poll());
        }
        //Insert the new element at the desired index
        num.offer(elementToInsert);
       //Enqueue back the elements from the temporary queue
        while(!tempQueue.isEmpty()) 
        {
            num.offer(tempQueue.poll());
        }
        System.out.println("Updated Queue:"+num);
        System.out.println("Enter the element u want to remove:");
        int removeEle=input.nextInt();
        if(num.remove(removeEle))
        {
            System.out.println("Element "+removeEle+" removed successfully.");
        }
        else
        {
            System.out.println("Element not found in the queue.");
        }
        System.out.println("Updated Queue:"+num);
    }
}
