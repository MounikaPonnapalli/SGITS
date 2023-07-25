//29.Sort a vector using Insertion Sort
import java.util.Scanner;
class Insertion29
{
    static void insertionSort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while((j>-1)&&(arr[j]>key))
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the no.of elements u want:");
        int num=input.nextInt();
        System.out.println("Enter the Elements:");
        int[] arr=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=input.nextInt();
        }
        for(int i=0;i<num;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        insertionSort(arr);
        System.out.println("After Sorting:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }

    }
}