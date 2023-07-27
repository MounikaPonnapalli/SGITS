//44.Search for an element in a linked list
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;
public class SearchEleLinkedList44
{
    public static void main(String[] args) 
    {
        List<Integer>numbers=new LinkedList<>();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of Elements in the list:");
        int num=input.nextInt();
        for(int i=0;i<num;i++)
        {
            int number=input.nextInt();
            numbers.add(number);
        }
        System.out.println("List: "+numbers);
        //Search for an element in the list
        System.out.print("Enter the element you want to search:");
        int elementToSearch=input.nextInt();
        if(numbers.contains(elementToSearch))
        {
            int index=numbers.indexOf(elementToSearch);
            System.out.println("Element "+elementToSearch +"found at index "+index);
        } 
        else
        {
            System.out.println("Element "+elementToSearch+" not found in the list.");
        }
    }
}
