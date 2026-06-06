import java.util.*;
public class ques35
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing a half character pyramid with repeated charaters");
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        int i,j;
        char ch='A';
        for (i=1;i<=n;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
            ch++;
        }
        sc.close();
    }
}