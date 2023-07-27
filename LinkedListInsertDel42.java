//42.Create Insert and delete elements in a linked list.
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;
class LinkedListInsertDel42 
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
        //Insertion
        System.out.print("Enter the element u want to insert:");
        int elementToInsert=input.nextInt();
        System.out.print("Enter the index where u want to insert the element:");
        int indexToInsert=input.nextInt();
        if(indexToInsert>=0 && indexToInsert<=numbers.size()) 
        {
            numbers.add(indexToInsert,elementToInsert);
            System.out.println("Element "+elementToInsert+"inserted at index "+indexToInsert);
        } 
        else
        {
            System.out.println("Invalid index for insertion.");
        }
        System.out.println("Updated List: "+numbers);
        //Deletion 
        System.out.print("Enter the index u want to delete:");
        int indexToDel=input.nextInt();
        if(indexToDel>=0 && indexToDel<=numbers.size()) 
        {
            numbers.remove(indexToDel);
            System.out.println("Element remove at index:"+indexToDel);
        } 
        else
        {
            System.out.println("Invalid index for Deletion.");
        }
        System.out.println("Updated List:"+numbers);

    }
}
