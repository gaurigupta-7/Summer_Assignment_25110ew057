import java.util.*;
public class ques11
{
    public static void main(String[] args)
    {
        Scanner sc=new scanner(System.in);
        System.out.println("enter two numbers to find GCD of");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int t;
        while(b!=0)
        {
            t=b;
            b=a%b;
            a=t;
        }
        System.out.println("GCD="+a);
    }
}