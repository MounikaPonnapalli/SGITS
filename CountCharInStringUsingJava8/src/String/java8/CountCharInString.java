//Count the occurences of each character in a string.

package String.java8;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
public class CountCharInString {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String u want:");
		String str=input.next();
		String[] arr=str.split("");
		Map<String,List<String>> map=Arrays.stream(arr).collect(Collectors.groupingBy(s->s));
		System.out.println(map);
		Map<String,Long>map1=Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map1);
	}

}
