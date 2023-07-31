import java.util.Scanner;
class TowerOfHanoi
{
    public static int towerOfHanoi(int num,int A,int B,int C)
    {
        int moves=0;
        if (num>0)
        {
            moves+=towerOfHanoi(num-1,A,C,B);
            System.out.println(A+"->"+C);
            moves++;
            moves+=towerOfHanoi(num-1,B,A,C);
        }
        return moves;
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of discs:");
        int num=input.nextInt();
        System.out.println("Enter the Source A:");
        int A=input.nextInt();
        System.out.println("Used disc");
        int B=input.nextInt();
        System.out.println("Enter the Destination:");
        int C=input.nextInt();
        int totalMoves=towerOfHanoi(num,A,B,C);
        System.out.println("Total moves: "+totalMoves);
    }
}

