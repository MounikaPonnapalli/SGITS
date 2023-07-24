//24.Search for an element in a vector(linear search)
import java.util.Scanner;
class LinearSearch24 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of elements you want:");
        int num=input.nextInt();
        int[] arr=new int[num];
        for (int i=0;i<num;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the element you want to search:");
        int k=input.nextInt();
        boolean found=false;
        for(int i=0;i<num;i++)
        {
            if (arr[i]==k)
            {
                found=true;
                break;
            }
        }
        if(found)
        {
            System.out.println("Element found");
        } 
        else 
       {
            System.out.println("Element not found");
        }
    }
}
