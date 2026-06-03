import java.util.*;
public class ques15
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter a number to find the armstrong of:");
        int n=sc.nextInt();
        int t=n,d,arm=0,c=0;
        while(t!=0)
        {
            d=t%10;
            c++;
        }
        t=n;
        while(t!=0)
        {
            d=t%10;
            arm=arm+Math.pow(d,c);

        }
        System.out.println("Armstrong number of"+n+"="+arm);
    }
}