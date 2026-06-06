import java.util.Scanner;
public class ques30
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing a character triangle");
        int i,j;
        for (i=1;i<=5;i++)
        {
            char ch = 'A';
            for (j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}