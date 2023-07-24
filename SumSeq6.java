//Sumof sequence 1+1/1!+1/2!.....
import java.util.Scanner;
class SumSeq6
{
    public static int fact(int num)
    {
         if(num==0||num==1)
         {
              return 1;
          }
          return   num*fact(num-1);
     }
     public static float sumSeq(int num)
     {
         float sum=0;
         for(int i=0;i<num;i++)
         {
             sum=sum+(1/fact(i));
          }
          return sum;
      }
         
      public static void main(String[] args)
      {
         Scanner input=new Scanner(System.in);
         int num=input.nextInt();
         float sum=sumSeq(num);
         System.out.println(sum);
    }
}
