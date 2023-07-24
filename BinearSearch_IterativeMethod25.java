//25 Search for an element in a vector(without recursion).Using Binary search IterativeMethod
import java.util.Scanner;
class BinearSearch_IterativeMethod25
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int num=input.nextInt();
		int[] arr=new int[num];
		System.out.println("Enter the elements:");
		for(int i=0;i<num;i++)
		{
			arr[i]=input.nextInt();
		}
		System.out.println("Enter the element to be search:");
		int k=input.nextInt();
                int low=0,high=num-1;
		int mid=(low+high)/2;
		while(low<=high)
		{
			if(arr[mid]==k)
			{
				System.out.println("Element found at:"+mid);
		                break;
			}
			else if(arr[mid]<k)
			{
				low=mid+1;
			}
			else
                        {
                                high=mid-1;
			}
			mid=(low+high)/2;
                }
                if(low>high)
		{
			System.out.println("Element not found.");
		}
           }
}