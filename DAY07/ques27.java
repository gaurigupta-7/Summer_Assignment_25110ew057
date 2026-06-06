import java.util.*;
public class ques27
{
    static int sumofdigits(int n)
    {
        if (n==0)
        {
            return 0;
        }
        return (n%10) + sumofdigits(n/10);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find the sum of its digits");
        int n=sc.nextInt();
        int result = sumofdigits(n);
        System.out.println("The sum of the digits of the given number "+n+" is "+result);
        sc.close();
    }
}