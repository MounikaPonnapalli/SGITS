//12)Find least common divisor of two integers
import java.util.Scanner;
class LCD12
{
	public static int LCD(int num1,int num2)
	{
		int lcm=1;
		int smallNo=Math.min(num1,num2);
		for(int i=2;i<=smallNo;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				lcm=i;
			}
		}
		return lcm;
	}
        public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter num1 and num2 u want:");
		int num1=input.nextInt();
		int num2=input.nextInt();
		int lcm=LCD(num1,num2);
		System.out.println("The LCD"+num1+"and"+num2+"is :"+lcm);
          }
}