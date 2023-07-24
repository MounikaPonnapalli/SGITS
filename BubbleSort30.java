//30.Sorting vector (bubble sort)
import java.util.Scanner;
class BubbleSort30
{
	static void bubbleSort(int[] arr)
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<(arr.length-i);j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
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
		System.out.println("Before Sorting:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		bubbleSort(arr);
		System.out.println("After sorting");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}

		