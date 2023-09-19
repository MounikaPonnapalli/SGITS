package arrays.java8;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class ListParticularStartingEle {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of elements in an array:");
		int num=input.nextInt();
		System.out.println("Enter the Elements:");
		int[] arr=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=input.nextInt();
		}
		for(int i=0;i<num;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Enter the starting element u want to search:");
		String startNum=input.next();
		List<String> n=Arrays.stream(arr)
				.boxed()
				.map(s->s+"")
				.filter(x->x.startsWith(startNum))
				.collect(Collectors.toList());
		System.out.println(n);
		
	}

}
