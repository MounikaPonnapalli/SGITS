//18 Reverse a vector without using temporary variable.
import java.util.Scanner;
import java.util.Arrays;
class ReverseWithOutTemp18
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of Elements u want:");
		int num=input.nextInt();
                int[] arr=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=input.nextInt();
                }
		System.out.println("Original vector:"+Arrays.toString(arr));
		int i=0;
                int j=arr.length-1;
		while(i<j)
		{
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
			i++;
			j--;
		}
		System.out.println("Reversed vector: " + Arrays.toString(arr));

          }
}
           