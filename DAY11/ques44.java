import java.util.Scanner;
public class ques44
{
    static int factorial(int num)
    {
        int fact=1,i;
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find their factorial");
        int n=sc.nextInt();
        int result=factorial(n);
        System.out.println("Factorial of "+n+" is "+result);
        sc.close();
    }
}