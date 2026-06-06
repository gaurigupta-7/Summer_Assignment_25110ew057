import java.util.Scanner;
public class ques34
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing a reverse number triangle");
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int i,j;
        for (i=n;i>0;i--)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}