import java.util.Scanner;
public class ques38
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing a reverse star pyramid");
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int i,j,k,sp;
        sp=0;
        for (i=n;i>0;i--)
        {
            for (k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for (j=1;j<(i*2);j++)
            {
                System.out.print("*");
            }
            System.out.println();
            sp++;
        }
        sc.close();
    }
}