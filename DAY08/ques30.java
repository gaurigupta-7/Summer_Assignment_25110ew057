import java.util.*;
public class ques30
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Printing a half pyramid of 5 rows with numbers");
        int i,j;
        for(i=1;i<=5;i++)
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