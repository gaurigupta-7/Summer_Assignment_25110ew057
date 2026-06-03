package DAY5;

import java.util.Scanner;

public class ques18
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check strong number");
        int n=sc.nextInt();
        int t=n, d, fact, i,s;
        while(t!=0)
        {
            d=t%10;
            fact=1;
            for(i=1;i<=d;i++)
            {
                fact=fact*i;
            }
            s=s+fact;
        }
        if (s==n)
        {
            System.out.println(n+"is a strong number");
        }
        else{
            System.out.println(n+"is not a strong number");
        }
    }   
}
