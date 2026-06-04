import java.util.Scanner;
public class ques5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find the sum of digits");
        int n=sc.nextInt();
        int d,sum=0,t=n;
        while(n!=0)
        {
            d=n%10;
            sum=sum+d;
            n=n/10;       }
        System.out.println("Sum of digits of "+t+" = "+sum);
    }
}
