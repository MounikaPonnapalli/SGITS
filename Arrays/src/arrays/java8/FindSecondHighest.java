//to find second highest number from given array
package arrays.java8;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class FindSecondHighest {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no.of elments u want in array:");
		int n=input.nextInt();
		System.out.println("Enter the elements in an array:");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		List<Integer> list=Arrays.stream(arr).boxed()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(list);
		
		Integer secondHighest=Arrays.stream(arr).boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst().get();
		System.out.println(secondHighest);
		
	}
}
