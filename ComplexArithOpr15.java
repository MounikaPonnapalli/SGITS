//15 Perform complex arthmetic operations
import java.util.Scanner;
class ComplexArithOpr15 
{
    public static void main(String[] args)
    {
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the real part of the first complex number:");
    double real1=input.nextDouble();
    System.out.println("Enter the imaginary part of the first complex number.:");
    double imaginary1=input.nextDouble();
    System.out.println("Enter the real part of the Second complex number");
    double real2=input.nextDouble();
    System.out.println("Enter the imaginary part of the second complex number.");
    double imaginary2=input.nextDouble();
    double sumReal=real1+real2;
    double sumImaginary=imaginary1+imaginary2;
    System.out.println("Sum:"+sumReal+"+"+sumImaginary+"i");
    double diffReal=real1-real2;
    double diffImaginary=imaginary1-imaginary2;
    System.out.println("Difference:"+diffReal+"+"+diffImaginary+"i");
    double prodReal=real1*real2-imaginary1*imaginary2;
    double prodImaginary=real1*imaginary2+imaginary1*real2;
    System.out.println("Product:"+prodReal+"+"+prodImaginary+"i");
    double divisor=real2*real2+imaginary2*imaginary2;
    double quotientReal=(real1*real2+imaginary1*imaginary2)/divisor;
    double quotientImaginary=(imaginary1*real2-real1*imaginary2)/divisor;
    System.out.println("Quotient:"+quotientReal+"+"+quotientImaginary+"i");
    }
}
