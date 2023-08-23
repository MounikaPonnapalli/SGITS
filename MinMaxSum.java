import java.util.Scanner;
public class MinMaxSum 
{
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter 5 Elements in the array:");
        for(int i=0;i<5;i++) 
        {
            arr[i]=input.nextInt();
        }
        int minSum=Integer.MAX_VALUE;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++) 
        {
            sum=sum+arr[i];
            if(arr[i]<minSum) 
            {
                minSum=arr[i];
            }
            if(arr[i]>maxSum) 
            {
                maxSum=arr[i];
            }
        }
        int sumMin=sum-maxSum;
        int sumMax=sum-minSum;
        System.out.println("Minimum Sum:"+sumMin);
        System.out.println("Maximum Sum:"+sumMax);
    }
}
