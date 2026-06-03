import java.util.Scanner;
public class ques7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int d,prod=1, t=n;
        while (n!=0)
        {
            d=n%10;
            prod=prod*d;
            n=n/10;
        }
        System.out.println("Product of digits of a number "+t+" = "+prod);
    }
}
