import java.util.Scanner;
class ReversSumDigit9
{
   public static int reverse(int num)
   {
        int reverse=0,r;
        for(int i=0;i<=num;i++)
        {
            r=num%10;
            reverse=reverse*10+r;
            num=num/10;
        }
        return reverse;
    }
    public static int sum(int num)
    {
        int sum=0;
        int r;
        for(int i=1;i<=num;i++)
        {
            r=num%10;
            sum=sum+r;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        System.out.println(reverse(num));
        System.out.println(sum(num));
     }
}
