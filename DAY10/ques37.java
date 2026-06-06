import java.util.Scanner;
public class ques37
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing a star pyramid");
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        int i,j,k,sp;
        sp=n-1;
        for(i=1;i<=n;i++)
        {
            for (k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for(j=1;j<(i*2);j++)
            {
                System.out.print("*");
            }
            System.out.println();
            sp--;
        }
        sc.close();
    }
}