//26.Search for an element in a vector(bineary search with recursion).
import java.util.Scanner;
class BinarySearchWithRecursion26
{
    public static int binarySearch(int arr[], int low, int high, int key)
   {
        if(low<=high) 
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
            {
                return mid;
            } 
           else if(arr[mid]<key)
           {
                return binarySearch(arr,mid+1,high,key);
            } 
            else
            {
                return binarySearch(arr,low,mid-1,key);
            }
        }
        return -1;
    }
    public static void main(String[] args)
   {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num=input.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the elements of the array in sorted order:");
        for(int i=0;i<num;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int key=input.nextInt();
        int result=binarySearch(arr,0,num-1,key);
        if(result==-1)
        {
            System.out.println("Element not found.");
        } 
        else 
        {
            System.out.println("Element found at index"+result);
        }
    }
}