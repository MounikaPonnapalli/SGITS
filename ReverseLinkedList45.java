//45.reverse a linked list.
import java.util.LinkedList;
import java.util.Scanner;
public class ReverseLinkedList45
{
    public static void main(String[] args)
    {
        LinkedList<Integer> numbers=new LinkedList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the elements in list:");
        int num=input.nextInt();
        for(int i=0;i<num;i++)
        {
            int number=input.nextInt();
            numbers.add(number);
        }
        System.out.println("Original Linked List: " + numbers);
        //Reverse the linked list
        LinkedList<Integer> reversedList=new LinkedList<>();
        while(!numbers.isEmpty()) 
        {
            reversedList.add(numbers.pollLast());
        }
        System.out.println("Reversed Linked List: "+reversedList);
    }
}