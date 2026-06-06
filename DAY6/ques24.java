import java.util.*;
public class ques24
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Enter the power to which the number is to be raised");
        int p=sc.nextInt();
        int i,t=n;
        for (i=1;i<=p;i++)
        {
            n=n*t;
        }
        System.out.println("The result of raising "+t+" to "+p+" is "+n);
        sc.close();
    }
}
