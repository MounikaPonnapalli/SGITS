//To find first non-repeat element in given a string
package String.java8;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;
public class FirstNonRepeatedEle {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=input.nextLine();
		String[] arr=str.split("");
		Map<String,List<String>> map=Arrays.stream(arr).collect(Collectors.groupingBy(s->s));
		System.out.println(map);
		
		String value=Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(s->s.getValue()==1)
				.findFirst().get().getKey();
		System.out.println(value);
		
		//using Skip() and Limit()
		List<String> list=Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.filter(s->s.getValue()==1)
				.map(Map.Entry::getKey).skip(1).limit(3)
				.collect(Collectors.toList());
				System.out.println(list);
	}
}
