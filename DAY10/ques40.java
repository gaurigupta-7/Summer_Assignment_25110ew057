import java.util.Scanner;
public class ques40
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing a charater pyramid");
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int i,j,k,sp;
        sp=n-1;
        for(i=1;i<=n;i++)
        {
            char ch='A';
            for (k=1;k<=sp;k++)
            {
                System.out.print(" ");
            }
            for (j=1;j<=i;j++)
            {
                System.out.print(ch);
                ch++;
            }
            ch--;
            for(j=i-1;j>0;j--)
            {
                ch--;
                System.out.print(ch);
            }
            System.out.println();
            sp--;
        }
        sc.close();
    }
}