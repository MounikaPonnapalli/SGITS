//28.Find the mean and median of n elements of vector A
import java.util.Arrays;
import java.util.Scanner;
public class MeanMedian28
 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements u want:");
        int num =input.nextInt();
        int[] arr=new int[num];
        System.out.print("Enter the elements of the vector A:");
        for (int i=0;i<num;i++) 
        {
            arr[i] = input.nextInt();
        }
        double sum = 0;
        for (int i=0;i<arr.length;i++)
        {
            sum+=num;
        }
        double mean=sum/num;
        Arrays.sort(arr);
        double median;
        if (num%2!=0) 
        {
            median=arr[num/2];
        } 
        else 
        {
            int mid1 = arr[num/2-1];
            int mid2 = arr[num/2];
            median=(double)(mid1+mid2)/2;
        }
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
    }
}
