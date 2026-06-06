import java.util.Scanner;
public class ques39
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing a number pyramid ");
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int i,j,k,sp;
        sp=n-1;
        for (i=1;i<=n;i++)
        {
            for (k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for (j=i-1;j>0;j--)
            {
                System.out.print(j);
            }
            System.out.println();
            sp--;
        }
        sc.close();
    }
}