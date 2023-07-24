//Generate pascal's triangle.
import java.util.Scanner;
class Pascal10
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
                System.out.println("Enter the no.of steps u want:");
		int num=input.nextInt();
		for(int i=0;i<=num;i++)
		{
			for(int j=1;j<num-i;j++)
			{
				System.out.print(" ");
			}
			int number=1;
			for(int k=0;k<=i;k++)
			{
				System.out.print(number+" ");
				number=number*(i-k)/(k+1);
                         }
			System.out.println();
		}
	}
}