//13 Compute Deviation of each score from average score
import java.util.Arrays;
import java.util.Scanner;
class DeviationScoreAvg13 
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
	System.out.println("Enter the no.of elements:");
        int num=input.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++)
	{
            arr[i]=input.nextInt();
        }
        double avg=0;
        for(int i=0;i<num;i++) 
	{ 
            avg+=arr[i];
        }
        avg/=num;
        System.out.println("Scores:"+Arrays.toString(arr));
        System.out.println("Average Score:"+avg);
        double[] dev=new double[num];
        for(int i=0;i<num;i++)
        { 
            dev[i]=arr[i]-avg;
        }
        System.out.println("Deviations Avg:"+Arrays.toString(dev));
    }
}

