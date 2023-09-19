//To find longest string in an array.
package arrays.java8;
import java.util.Arrays;
import java.util.Scanner;
public class LongestString 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the no.of strings u want:");
		int n=input.nextInt();
		input.nextLine();
		System.out.println("Enter the strings:");
		String[] str=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=input.nextLine();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(str[i]);
		}
		String Long=Arrays.stream(str).reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
		System.out.println(Long);
		
	}
}
