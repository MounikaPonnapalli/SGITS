import java.util.Scanner;
public class SelectionSort27 
{
    static void selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int min=i;
            for(int j=i+1;j<(arr.length);j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no. of elements u want:");
        int num=input.nextInt();
        System.out.println("Enter the elements:");
        int[] arr=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.println("Before Swapping:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        selectionSort(arr);
        System.out.println("After Swapping:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
