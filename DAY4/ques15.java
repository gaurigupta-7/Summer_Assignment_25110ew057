import java.util.*;
public class ques15
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number to check the armstrong of:");
        int n=sc.nextInt();
        int t=n,d,arm=0,c=0;
        while(t!=0)
        {
            d=t%10;
            c++;
            t=t/10;
        }
        t=n;
        while(t!=0)
        {
            d=t%10;
            arm=arm+(int)Math.pow(d,c);
            t=t/10;

        }
        if (n==arm)
        {
            System.out.println(n+" is an armstrong number");
        }
        else
        {
            System.out.println(n+" is not an armstrong number");
        }
    }
}
