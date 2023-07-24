//Generate every integer between 1 and n divisible by m.
import java.util.Scanner;
class Generate2
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                System.out.println(i +"is divisible by "+ m );
            }
        }
    }
}