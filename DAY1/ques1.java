package DAY1;

import java.util.*;
public class ques1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n=sc.nextInt();
        int i, sum=0;
        for (i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of first natural"+n+"numbers="+sum);
        sc.close();
    }
}