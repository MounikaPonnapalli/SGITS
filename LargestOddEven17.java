//17.Find the largest odd and even integers.
import java.util.Scanner;
class LargestOddEven17 
{
    public static void main(String[] args) 
   {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int num=input.nextInt();
        int[] arr=new int[num];
        System.out.println("Enter "+num+" integers:");
        for (int i=0;i<num;i++)
        {
            arr[i]=input.nextInt();
        }
        int largestOdd=Integer.MIN_VALUE;
        int largestEven=Integer.MIN_VALUE;
        for (int i=0;i<num;i++)
        {
            if(arr[i]%2!=0 && arr[i]>largestOdd)
            {
                largestOdd=arr[i];
            } 
            else if(arr[i]%2==0 && arr[i]>largestEven)
            {
                largestEven=arr[i];
            }
        }
        System.out.println("The largest odd integer is:"+largestOdd);
        System.out.println("The largest even integer is:"+largestEven);
    }
}

