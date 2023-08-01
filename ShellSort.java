//11.8 Sort the elements using Shell Sort
import java.util.Scanner;
public class ShellSort 
{
    public static void shellSort(int[] arr)
    {
        if(arr==null||arr.length==0)
        {
            return;
        }
        for(int gap=arr.length;gap>0;gap/=2)
        {
            for(int i=gap;i<arr.length;i++)
            {
                int temp=arr[i];
                int j=i;
                while(j>=gap&&arr[j-gap]>temp)
                {
                    arr[j]=arr[j-gap];
                    j-=gap;
                }
                arr[j]=temp;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no.of elements in array:");
        int num=input.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter the Elements:");
        for(int i=0;i<num;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.print("Original array:");
        for(int i=0;i<num;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Sorted array:");
        for(int i=0;i<num;i++)
        {
            shellSort(arr);
            System.out.print(arr[i]+" ");
        }
    }
}