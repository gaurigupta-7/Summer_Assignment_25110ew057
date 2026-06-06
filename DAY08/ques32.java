import java.util.*;
public class ques32
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing a half pyramid of repeated numbers");
        int i, j;
        for (i=1;i<=5;i++)
        {
            for (j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}