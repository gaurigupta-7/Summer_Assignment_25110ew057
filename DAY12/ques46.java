import java.util.*;
public class ques46
{
    static void armstrong(int num)
    {
        int t=num,d,c=0,arm=0;
        while (t>0)
        {
            d=t%10;
            c++;
            t=t/10;
        }
        t=num;
        while(t>0)
        {
            d=t%10;
            arm=arm+(int)Math.pow(d,c);
            t=t/10;
        }
        if(arm==num)
        {
            System.out.println(num+" is an armstrong number");
        }
        else
        {
            System.out.println(num+" is not an armstrong number");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        armstrong(n);
        sc.close();
    }
}