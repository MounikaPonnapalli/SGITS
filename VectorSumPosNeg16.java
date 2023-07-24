//16.Sum the positive and negative elements of a vector
import java.util.Scanner;
import java.util.Arrays;
class VectorSumPosNeg16
{
    public static void main(String[] args)
   {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the size of the vector: ");
        int n=input.nextInt();
        int[] vector=new int[n];
        for(int i=0;i<n;i++)
       {
            vector[i]=input.nextInt();
        }
        int posSum=0;
        int negSum=0;
        for(int i=0;i<n;i++)
	{
            if(vector[i]>0)
            {
                posSum+=vector[i];
            } 
            else if(vector[i]<0)
            {
                negSum+=vector[i];
            }
        }
        System.out.println("Vector: "+Arrays.toString(vector));
        System.out.println("Sum of positive elements:"+posSum);
        System.out.println("Sum of negative elements:"+negSum);
    }
}
