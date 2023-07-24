//Sum the sequence 2/9- 5/13 + 8/17...
import java.util.Scanner;
class SumSeq5
{
	public static float sumSeq(int i,int num,float sum)
	{
		if(i>num)
		     return sum;
                else
		    if(i%2==0)
			sum=sum-(float)2+(num-1)*3/(9+(num-1)*4);
		    else
			sum=sum+(float)2+(num-1)*3/(9+(num-1)*4);
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