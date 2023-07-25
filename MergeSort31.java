import java.util.Arrays;
import java.util.Scanner;
public class MergeSort31 
{
    public static int[] mergeSort(int[] arr1, int[] arr2)
    {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length)
        {
            if (arr1[i] <= arr2[j])
            {
                mergedArray[k] = arr1[i];
                i++;
            }
            else
            {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length)
        {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length)
        {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }
        return mergedArray;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements you want:");
        int num = input.nextInt();   
        int[] arr1 = new int[num];
        int[] arr2 = new int[num];
        System.out.println("Enter the elements in array1:");
        for (int i = 0; i < num; i++)
        {
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter the elements in second array:");
        for (int i = 0; i < num; i++)
        {
            arr2[i] = input.nextInt();
        }
        int[] result = mergeSort(arr1, arr2);
        System.out.println("Merged sorted array: " + Arrays.toString(result));
    }
}