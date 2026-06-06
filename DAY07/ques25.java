import java.util.Scanner;
public class ques25
{
    static int factorial(int n)
    {
        if(n==0 ||n==1)
        {
            return n;
        }
        int fact = factorial(n-1) * n;
        return fact;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find the factorial of");
        int n=sc.nextInt();
        int result =factorial(n);
        System.out.println("The factorial of "+n+" is "+result);
        sc.close();
    }
}