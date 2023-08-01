//Sort the elements using quick sort.
import java.util.Scanner;
class QuickSort 
{
    static int partition(int arr[],int low,int high)
    {
        int pivot=arr[high];
        int i=(low-1);
        for(int j=low;j<high;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return(i+1);
    }
    static void quickSort(int arr[],int low,int high) 
    {
        if(low<high)
        {
            int pi=partition(arr,low,high);
            quickSort(arr,low,pi-1);
            quickSort(arr,pi+1,high);
        }
    }
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of Elements:");
        int num=input.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the elements:");
        for(int i=0;i<num;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("Before sorting:");
        for(int i=0;i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        quickSort(arr,0,num-1);
        System.out.println("Sorted Array in Ascending Order:");
        for(int i=0;i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
