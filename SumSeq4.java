//Sum the sequence 1-1/2 + 1/3 - 1/4...
import java.util.Scanner;
class SumSeq4
{
	public static float sumSeq(int i,int num,float sum)
    	{
		if(i>num)
			return sum;
		else
			if(i%2==0)
				sum=sum-(float)1/i;
			else
				sum=sum+(float)1/i;
			return sumSeq(i+1,num,sum);
	}
        public static void main(String[] args) 
       {
        	Scanner input=new Scanner(System.in);
        	int num=input.nextInt();
                float res=sumSeq(1,num,0);
                System.out.println(res);
        }
}				