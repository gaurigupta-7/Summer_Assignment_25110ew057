import java.util.Scanner;
public class ques3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find the factorial of");
        int n=sc.nextInt();
        int i,fact=1;
        for (i=1;i<=n;i++)
        {
            fact+fact*i;
        }
        System.out.println("Factorial of"+n+"="+fact);
        
    }
}