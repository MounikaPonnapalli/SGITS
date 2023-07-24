//20.Find largest and smallest difference in an array.
import java.util.Scanner;
import java.util.Arrays;
public class LargeSmallestDiff20
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
        System.out.println(Arrays.toString(arr));
        int largeDiff=Integer.MIN_VALUE;
        int smallDiff=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int diff=Math.abs(arr[i]-arr[j]);
                if(diff>largeDiff) 
                {
                    largeDiff=diff;
                }
                if(diff<smallDiff)
                {
                    smallDiff=diff;
                }
            }
        }
        System.out.println("Largest Difference: "+largeDiff);
        System.out.println("Smallest Difference: "+smallDiff);
    }
}
