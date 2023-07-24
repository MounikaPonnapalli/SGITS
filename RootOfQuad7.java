//Find the roots of quadratic equation
import java.util.Scanner;
class RootOfQuad7
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the value of a, b and c : ");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        double d=(b*b)-(4*a*c);
        double r1,r2;
        if(d==0)
        {
            System.out.println("Roots are equal");
            r1=-b/2*a;
            r2=b/2*a;
            System.out.println("Root 1= root 2="+r1);
        }
        else if(d>0)
        {
            r1=(-b+Math.sqrt(d))/2*a;
            r2=(-b-Math.sqrt(d))/2*a;
            System.out.println("Roots of eqations is"+r1+" "+r2);
        }
        else
        {
            System.out.println("Imaginary Roots");
        }
        
    }
}